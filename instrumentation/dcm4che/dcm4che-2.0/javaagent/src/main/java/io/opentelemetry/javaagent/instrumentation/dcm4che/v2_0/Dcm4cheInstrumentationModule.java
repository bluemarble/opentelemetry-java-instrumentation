/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.javaagent.instrumentation.dcm4che.v2_0;

import io.opentelemetry.javaagent.tooling.InstrumentationModule;
import io.opentelemetry.javaagent.tooling.TypeInstrumentation;
import java.util.List;

import static java.util.Arrays.asList;

public class Dcm4cheInstrumentationModule extends InstrumentationModule {

  public Dcm4cheInstrumentationModule() {
    super("dcm4che", "dcm4che-2.0");
  }

  /**
   * Returns a list of all individual type instrumentation in this module.
   */
  @Override
  public List<TypeInstrumentation> typeInstrumentations() {
    return asList(new AssociationInstrumentation());
  }
}
