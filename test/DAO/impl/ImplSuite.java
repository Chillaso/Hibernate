/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author chillaso
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({DAO.impl.ProfesorImpleTest.class, DAO.impl.InstitutoImpleTest.class, DAO.impl.AsignaturaImpleTest.class, DAO.impl.AlumnoImpleTest.class, DAO.impl.NotaImpleTest.class})
public class ImplSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
