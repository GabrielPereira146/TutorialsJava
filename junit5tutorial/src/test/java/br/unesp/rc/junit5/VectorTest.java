package br.unesp.rc.junit5;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({VectorEqualTest.class, VectorSizeTest.class})
public class VectorTest {

}