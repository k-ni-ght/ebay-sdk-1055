package com.ebay.sdk;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SdkAPIInterfaceServiceLocatorTest {

  @Test
  public void shouldLoadWsdl() {
    SdkAPIInterfaceServiceLocator sdkAPIInterfaceServiceLocator = new SdkAPIInterfaceServiceLocator();
    assertThat(sdkAPIInterfaceServiceLocator).isNotNull();
  }
}
