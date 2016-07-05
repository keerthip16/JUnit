
package jUnit.intro.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({OperationImplTest.class, SortingImplTest.class, GCDTest.class})
public class AllTests {
    // code nothing here
}
