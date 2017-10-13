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
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Exercise01 {
    /** the AUT-Agent */
    private AUTAgent m_agent;

    /** prepare */
    @Before
    public void setUp() throws Exception {
        m_agent = MakeR.createAUTAgent(LocalSettings.AUT_AGENT_HOSTNAME, 
                                       LocalSettings.AUT_AGENT_PORT);
        m_agent.connect();
    }
    
    @Test
    public void test() {
        Assert.assertTrue(m_agent.isConnected());
    }

    /** cleanup */
    @After
    public void tearDown() throws Exception {
        m_agent.disconnect();
    }
}