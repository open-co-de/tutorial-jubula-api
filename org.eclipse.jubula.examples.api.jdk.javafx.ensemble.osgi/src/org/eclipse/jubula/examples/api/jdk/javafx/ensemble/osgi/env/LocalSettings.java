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
package org.eclipse.jubula.examples.api.jdk.javafx.ensemble.osgi.env;

import org.eclipse.jubula.client.launch.AUTConfiguration;
import org.eclipse.jubula.toolkit.javafx.config.JavaFXAUTConfiguration;

/** Local and environment specific settings */
public class LocalSettings {
    public static final String AUT_AGENT_HOSTNAME = "localhost";
    public static final int AUT_AGENT_PORT = 60000;

    /** @return the configuration settings to start the AUT */
    public static AUTConfiguration myAUTStartConfig() {
        return new JavaFXAUTConfiguration(
                "My first AUT",
                "Ensemble8_AUT_ID", 
                "java",
                "/pathToEnsembleJAR/",
                new String[] { "-jar", "Ensemble8.jar" }
        );
    }
}