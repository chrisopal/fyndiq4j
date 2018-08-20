package com.salesmore.yak.integration.fyndiq.service;

import com.salesmore.yak.integration.fyndiq.api.client.IFQClientBuilder;
import com.salesmore.yak.integration.fyndiq.service.client.FQClientBuilder;

public class FQClientFactory {

    public static IFQClientBuilder builder() {
        return new FQClientBuilder();
    }
}
