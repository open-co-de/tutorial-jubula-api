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
import org.eclipse.jubula.examples.api.jdk.javafx.ensemble.osgi.env.LocalSettings;
import org.eclipse.jubula.toolkit.javafx.JavafxComponents;
import org.eclipse.jubula.tools.AUTIdentifier;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** @author BREDEX GmbH */
public class BasicExercise02 {
    /** the AUT-Agent */
    private AUTAgent m_agent;
    /** the AUT */
    private AUT m_aut;

    /** prepare */
    @Before
    public void setUp() throws Exception {
        m_agent = MakeR.createAUTAgent("localhost", LocalSettings.AUT_AGENT_PORT);
        m_agent.connect();

        AUTIdentifier id = m_agent.startAUT(LocalSettings.myAUTStartConfig());
        if (id != null) {
            m_aut = m_agent.getAUT(id, JavafxComponents.getToolkitInformation());
            m_aut.connect();
        } else {
            Assert.fail("AUT start has failed!"); //$NON-NLS-1$
        }
    }
    
    @Test
    public void test() {
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