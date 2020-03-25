import java.util.Collection;
import org.junit.*;
import org.junit.Test;
import junit.framework.*;


public class ToDoListTest extends TestCase{
	// Define Test Fixtures
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		//Initialise Test Fixtures
	}
	@After
	 public void tearDown() throws Exception{
		// Uninitialise test Fixtures
	}

	@Test
	public void testAddTask() {
		//Create a Task and Task List
		Task t1 = new Task("This is the 1st task."); //create a task		
		ToDoList tdl1 = new ToDoList(); //create a task-list
		//Check if Task and ToDoList is created
		assertNotNull("The task was created", t1); //t1 was created 
		assertNotNull("The task list was created", tdl1); //tdl1 was created 
		assertTrue("Initial Stack state", tdl1.getAllTasks().isEmpty()); //check if the task list is empty
		
		//Call the addTask() method and pass the Task object as the parameter
		tdl1.addTask(t1); //add the task created into the task-list

		//Call getAllTasks(), Asset that the number of Tasks returned is 1.
		//Check if the ToDoList has something
		assertTrue(tdl1.getAllTasks().size() == 1); //Check if the ToDoList has 1 Task

		//fail("Not implemented yet");
	}

	@Test
	public void testgetStatus() {
		//fail("Not implemented yet");
	}
	@Test
	public void testRemoveTask() {
		//fail("Not implemented yet");
	}
	@Test
	public void testGetCompletedTasks() {
		//fail("Not implemented yet");
	}
}
