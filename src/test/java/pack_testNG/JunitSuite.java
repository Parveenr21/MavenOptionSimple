package pack_testNG;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@SuiteClasses({ methodrun_Junit.class,methodrun_Junit2Duplicate.class })
public class JunitSuite {

}
