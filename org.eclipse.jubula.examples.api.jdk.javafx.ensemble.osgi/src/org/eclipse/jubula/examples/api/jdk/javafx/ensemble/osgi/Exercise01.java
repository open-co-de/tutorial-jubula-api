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

import org.eclipse.jubula.client.AUTAgent;
import org.eclipse.jubula.client.MakeR;
import org.eclipse.jubula.examples.api.jdk.javafx.ensemble.osgi.env.LocalSettings;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Exercise01 {
    private static AUTAgent agent;

    @BeforeClass
    public static void setUp() throws Exception {
        agent = MakeR.createAUTAgent(LocalSettings.AUT_AGENT_HOSTNAME, 
                                     LocalSettings.AUT_AGENT_PORT);
        agent.connect();
    }

    @Test
    public void testAUTAgentConnection() {
        Assert.assertTrue(agent.isConnected());
    }

    @AfterClass
    public static void tearDown() throws Exception {
        agent.disconnect();
    }
}