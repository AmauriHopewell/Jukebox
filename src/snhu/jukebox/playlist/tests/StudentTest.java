package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import snhu.jukebox.playlist.Student;
import snhu.jukebox.playlist.StudentList;
import snhu.student.playlists.*;


public class StudentTest {

	//Test the list of student names and ensure we get back the name value we expect at the correct/specific point in the list
	@Test
	public void testGetStudentNameList1() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals(true, studentNames.contains("TestStudent1Name"));					//test case to see if the StudentList contains the name we expect
	}
	
	@Test
	public void testGetStudentNameList2() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals(true, studentNames.contains("TestStudent2Name"));					//test case to see if the StudentList contains the name we expect
	}
	
    ///////////////////////////////////////////////////////////////////
    // MODULE 5 CODE ASSIGNMENT                                      //
    // - Use examples above to add your your unit test to check      //
    //     for your name after you have added it to the StudentList  //
    // - Add your code BELOW this comment block                      //
    ///////////////////////////////////////////////////////////////////
	
	@Test
	public void testGetStudentNameListAmauriHopewell() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals(true, studentNames.contains("Amauri Hopewell"));					//test case to see if the StudentList contains the name we expect
	}
	
	
	
	
	
	
	//Test each student profile to ensure it can be retrieved and accessed
	@Test
	public void testGetStudent1Profile() {
		TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();						//instantiating the variable for a specific student
		Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());		//creating populated student object
		assertEquals("TestStudent1", TestStudent1.getName());											//test case pass/fail line - did the name match what you expected?
	}
	
	@Test
	public void testGetStudent2Profile() {
		TestStudent2_Playlist testStudent2Playlist = new TestStudent2_Playlist();
		Student TestStudent2 = new Student("TestStudent2", testStudent2Playlist.StudentPlaylist());
		assertEquals("TestStudent2", TestStudent2.getName());
	}
	
    //////////////////////////////////////////////////////////////////////
    // MODULE 6 CODE ASSIGNMENT                                         //
    // - Use examples above to add your your unit test to check         //
    //     for your profile after you have added it to the StudentList  //
    // - Add your code BELOW this comment block                         //
    //////////////////////////////////////////////////////////////////////
	
		@Test
		public void testGetStudentAmauriHopewellProfile() {
			Amauri_Hopewell_Playlist amauriHopewellPlaylist = new Amauri_Hopewell_Playlist();						//instantiating the variable for a specific student
			Student AmauriHopewell = new Student("Amauri Hopewell", amauriHopewellPlaylist.StudentPlaylist());		//creating populated student object
			assertEquals("Amauri Hopewell", AmauriHopewell.getName());											//test case pass/fail line - did the name match what you expected?
		}	
	
	
	
	
	
	
	
	
}
