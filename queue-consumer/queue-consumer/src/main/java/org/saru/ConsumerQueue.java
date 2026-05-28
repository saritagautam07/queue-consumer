package org.saru;

import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.ServiceBusQueueTrigger;
import com.microsoft.azure.functions.ExecutionContext;

/**
 * Azure Functions with Service Bus Trigger.
 */
public class ConsumerQueue {
    /**
     * This function will be invoked when a new message is received at the Service Bus Queue.
     */
    @FunctionName("consumer-queue")
    public void run(
            @ServiceBusQueueTrigger(name = "message", queueName = "java-test1", connection = "ServiceBusConnection") String message,
            final ExecutionContext context
    ) {
        context.getLogger().info("Java Service Bus Queue trigger function executed.");
        context.getLogger().info(message);
    }
}

