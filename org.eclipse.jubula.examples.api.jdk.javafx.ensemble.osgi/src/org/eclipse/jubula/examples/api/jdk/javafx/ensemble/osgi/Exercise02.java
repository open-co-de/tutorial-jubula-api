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

import org.eclipse.jubula.client.AUT;
import org.eclipse.jubula.client.AUTAgent;
import org.eclipse.jubula.client.MakeR;
import org.eclipse.jubula.examples.api.jdk.javafx.ensemble.osgi.env.LocalSettings;
import org.eclipse.jubula.toolkit.javafx.JavafxComponents;
import org.eclipse.jubula.tools.AUTIdentifier;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Exercise02 {
    private static AUTAgent agent;
    protected static AUT aut;

    @BeforeClass
    public static void setUp() throws Exception {
        agent = MakeR.createAUTAgent(LocalSettings.AUT_AGENT_HOSTNAME, 
                                       LocalSettings.AUT_AGENT_PORT);
        agent.connect();

        AUTIdentifier id = agent.startAUT(LocalSettings.myAUTStartConfig());
        if (id != null) {
            aut = agent.getAUT(id, JavafxComponents.getToolkitInformation());
            aut.connect();
        } else {
            Assert.fail("AUT start has failed!"); //$NON-NLS-1$
        }
    }
    
    @Test
    public void testAUTConnection() {
        Assert.assertTrue(aut.isConnected());
    }

    @AfterClass
    public static void tearDown() throws Exception {
        aut.disconnect();
        agent.stopAUT(aut.getIdentifier());
        agent.disconnect();
    }
}