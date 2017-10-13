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

import org.eclipse.jubula.client.Result;
import org.eclipse.jubula.communication.CAP;
import org.eclipse.jubula.toolkit.concrete.components.Application;
import org.eclipse.jubula.toolkit.enums.ValueSets.Operator;
import org.eclipse.jubula.toolkit.javafx.JavafxComponents;
import org.junit.Assert;
import org.junit.Test;

public class Exercise03 extends Exercise02 {
    @Test
    public void testCAP() {
        Application app = JavafxComponents.createStage();
        CAP waitForWindow = app.waitForWindow(".*Ensmble.*", 
                                              Operator.matches,
                                              15 * 1000, 
                                              1000);
        Result<String> result = aut.execute(waitForWindow, "method payload");
        Assert.assertTrue(result.isOK());
    }
}