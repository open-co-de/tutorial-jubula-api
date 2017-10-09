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

	/** @return the configuration settings to start the AUT */
	public static AUTConfiguration myAUTStartConfig() {
		return new JavaFXAUTConfiguration(
                "org.eclipse.jubula.examples.api.jdk.javafx.ensemble.osgi", //$NON-NLS-1$
                "Ensemble8",
                "java", //$NON-NLS-1$
                "<pathToEnsembleJAR>", //$NON-NLS-1$
                new String[]{"-jar", "Ensemble8.jar"} //$NON-NLS-1$ //$NON-NLS-2$
                );
	}
}