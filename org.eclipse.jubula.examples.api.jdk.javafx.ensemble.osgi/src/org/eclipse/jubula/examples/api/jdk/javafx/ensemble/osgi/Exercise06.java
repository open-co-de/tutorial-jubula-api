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

import org.eclipse.jubula.toolkit.concrete.ConcreteComponents;
import org.eclipse.jubula.toolkit.concrete.components.TextInputComponent;
import org.eclipse.jubula.tools.ComponentIdentifier;
import org.junit.Test;

/** @author BREDEX GmbH */
public class Exercise06 extends Exercise04 {
    @Test
    public void testAbstract() {
        ComponentIdentifier<? extends TextInputComponent> ensembleSearchCI = OM.ensembleSearch;
        TextInputComponent ensembleSearch = ConcreteComponents.createTextInputComponent(ensembleSearchCI);
        aut.execute(ensembleSearch.replaceText("FXML Login Demo"), null);
    }
}