import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void shouldMatchTestCase1() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        Assertions.assertTrue(simpleTask.matches("Позвонить родителям"));
    }

    @Test
    public void shouldMatchTestCase2() {
        Epic epic = new Epic(5, new String[]{"Позвонить родителям", "Помыть посуду", "Погулять"}  );

        Assertions.assertTrue(epic.matches("Погулять"));
    }

    @Test
    public void shouldMatchTestCase3() {
        Meeting meeting = new Meeting(5, "Позвонить родителям", "Звонок", "28.03.2024 20:55");

        Assertions.assertTrue(meeting.matches("Звонок"));
    }
}
