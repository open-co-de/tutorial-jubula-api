/*******************************************************************************
 * Copyright (c) 2017 BREDEX GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     BREDEX GmbH - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.jubula.examples.api.jdk.javafx.ensemble.osgi;

import org.eclipse.jubula.client.AUT;
import org.eclipse.jubula.client.AUTAgent;
import org.eclipse.jubula.client.MakeR;
import org.eclipse.jubula.client.launch.AUTConfiguration;
import org.eclipse.jubula.toolkit.javafx.JavafxComponents;
import org.eclipse.jubula.toolkit.javafx.config.JavaFXAUTConfiguration;
import org.eclipse.jubula.tools.AUTIdentifier;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** @author BREDEX GmbH */
public class BasicLesson {
    /** AUT-Agent host name to use */
    public static final String AGENT_HOST = "localhost"; //$NON-NLS-1$
    /** AUT-Agent port to use */
    public static final int AGENT_PORT = 60000;
    /** the AUT-Agent */
    private AUTAgent m_agent;
    /** the AUT */
    private AUT m_aut;

    /** prepare */
    @Before
    public void setUp() throws Exception {
        /* Connecting to external Jubula AUT Agent which
        must be started manually BEFORE test execution! */
        m_agent = MakeR.createAUTAgent(AGENT_HOST, AGENT_PORT);
        m_agent.connect();

        final String autID = "Ensemble8"; //$NON-NLS-1$
        AUTConfiguration config = new JavaFXAUTConfiguration(
                "org.eclipse.jubula.examples.api.jdk.javafx.ensemble.osgi", //$NON-NLS-1$
                autID,
                "java.exe", //$NON-NLS-1$
                null, 
                new String[]{"-jar", "c:\\work\\Ensemble8.jar"} //$NON-NLS-1$ //$NON-NLS-2$
                );

        AUTIdentifier id = m_agent.startAUT(config);
        if (id != null) {
            m_aut = m_agent.getAUT(id, JavafxComponents.getToolkitInformation());
            m_aut.connect();
        } else {
            Assert.fail("AUT start has failed!"); //$NON-NLS-1$
        }
    }
    
    /** firstLesson */
    @Test
    public void firstLesson() {
		Assert.assertTrue(m_aut.isConnected());
	}

    /** cleanup */
    @After
    public void tearDown() throws Exception {
        m_aut.disconnect();
        m_agent.stopAUT(m_aut.getIdentifier());
        m_agent.disconnect();
    }
}