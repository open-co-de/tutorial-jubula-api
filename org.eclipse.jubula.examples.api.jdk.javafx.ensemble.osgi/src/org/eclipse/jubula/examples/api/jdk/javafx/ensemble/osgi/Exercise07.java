/*******************************************************************************
 * Copyright (c) 2017 Markus Tiede
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Markus Tiede - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.jubula.examples.api.jdk.javafx.ensemble.osgi;

import org.eclipse.jubula.client.exceptions.ActionException;
import org.eclipse.jubula.client.exceptions.CheckFailedException;
import org.eclipse.jubula.communication.CAP;
import org.eclipse.jubula.toolkit.concrete.components.Application;
import org.eclipse.jubula.toolkit.enums.ValueSets.Operator;
import org.eclipse.jubula.toolkit.javafx.JavafxComponents;
import org.junit.Test;

public class Exercise07 extends Exercise02 {
    @Test(expected = ActionException.class)
    public void testActionException() {
        Application app = JavafxComponents.createStage();
        CAP waitForWindow = app.waitForWindow(".*Ensmble.*", 
                                              Operator.matches,
                                              1 * 1000, 
                                              1000);
        aut.execute(waitForWindow, null);
    }
    
    @Test(expected = CheckFailedException.class)
    public void testCheckFailedException() {
        Application app = JavafxComponents.createStage();
        CAP waitForWindow = app.checkExistenceOfWindow(".*Ensmble.*", 
                                              Operator.matches,
                                              true, 
                                              1000);
        aut.execute(waitForWindow, null);
    }
}