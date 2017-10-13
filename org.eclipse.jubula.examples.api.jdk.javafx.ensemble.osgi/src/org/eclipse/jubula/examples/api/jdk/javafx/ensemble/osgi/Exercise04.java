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

import org.eclipse.jubula.toolkit.base.components.TextInputComponent;
import org.eclipse.jubula.toolkit.concrete.components.Application;
import org.eclipse.jubula.toolkit.enums.ValueSets.Modifier;
import org.eclipse.jubula.toolkit.enums.ValueSets.Operator;
import org.eclipse.jubula.toolkit.javafx.JavafxComponents;
import org.eclipse.jubula.toolkit.javafx.components.TextField;
import org.eclipse.jubula.tools.ComponentIdentifier;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** @author BREDEX GmbH */
public class Exercise04 extends Exercise02 {
    @Before
    public void localSetUp() throws Exception {
        aut.execute(JavafxComponents.createStage()
                        .waitForWindow(".*Ensemble.*", 
                            Operator.matches,
                            15 * 1000, 
                            1000), null);
    }

    @Test
    public void fillEnsembleSearchField() {
        ComponentIdentifier<TextField> ensembleSearchCI = OM.ensembleSearch;
        TextInputComponent ensembleSearch = JavafxComponents.createTextField(ensembleSearchCI);
        aut.execute(ensembleSearch.replaceText("FXML Login Demo"), null);
    }

    @After
    public void localTearDown() throws Exception {
        Modifier[] none = { Modifier.none };
        Application stage = JavafxComponents.createStage();
        aut.execute(stage.delay(2 * 1000), null);
        aut.execute(stage.keyCombination(none, "DOWN"), null);
        aut.execute(stage.keyCombination(none, "ENTER"), null);
        aut.execute(stage.delay(10 * 1000), null);
    }
}