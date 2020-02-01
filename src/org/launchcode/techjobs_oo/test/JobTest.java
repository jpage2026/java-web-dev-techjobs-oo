package org.launchcode.techjobs_oo.test;

import org.junit.*;
import org.launchcode.techjobs_oo.main.*;
import static org.junit.Assert.*;

public class JobTest {
    private Job job1,job2, job3, job4;

    @Before
    public void createTestJobObjects(){
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
    @Test
    public void jobsAreEqualIfTheyHaveSameId() {

        assertNotEquals(job1.getId(),job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){


       assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control",job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality(){

        assertFalse(job1.equals(job2));
    }

    @Test
    public void testNewlineBetweenJobs(){
      char testJob =  job3.toString().charAt(0);
      char otherTestJob = job3.toString().charAt(job3.toString().length()-1);
        assertTrue(testJob == otherTestJob);

    }


}