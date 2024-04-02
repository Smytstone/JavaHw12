import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTest {
    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        SimpleTask simpleTask = new SimpleTask(5, "Купить Молоко");

        String[] subtasks = { "Купить Молоко", "Купить Яйца", "Купить Хлеб" };
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Купить Молоко",
                "Поход в магазин",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = { simpleTask, epic, meeting };
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchQueryTestCase1() {
        SimpleTask simpleTask = new SimpleTask(5, "Купить Молоко");

        String[] subtasks = { "Купить Молоко", "Купить Яйца", "Купить Хлеб" };
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Купить Молоко",
                "Поход в магазин",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = { simpleTask, epic, meeting };
        Task[] actual = todos.search("Купить Молоко");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchQueryTestCase2() {
        SimpleTask simpleTask = new SimpleTask(5, "Купить Молоко");

        String[] subtasks = { "Купить Молоко", "Купить Яйца", "Купить Хлеб" };
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Купить Молоко",
                "Поход в магазин",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = { meeting };
        Task[] actual = todos.search("Поход в магазин");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchQueryTestCase3() {
        SimpleTask simpleTask = new SimpleTask(5, "Купить Молоко");

        String[] subtasks = { "Купить Молоко", "Купить Яйца", "Купить Хлеб" };
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Купить Молоко",
                "Поход в магазин",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = { };
        Task[] actual = todos.search("Купить вино");
        Assertions.assertArrayEquals(expected, actual);
    }
}
