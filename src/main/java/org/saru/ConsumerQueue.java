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

    // Main method for local message consumption
//    public static void main(String[] args) throws Exception {
//        String connectionString = "Endpoint=sb://queue1.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=taIKCr0AcgTtpokx8towDswNQzwXE5mlr+ASbMC9U8w="; // Set this env variable locally
//        String queueName = "java-test1";
//
//        com.azure.messaging.servicebus.ServiceBusClientBuilder builder = new com.azure.messaging.servicebus.ServiceBusClientBuilder()
//                .connectionString(connectionString);
//        com.azure.messaging.servicebus.ServiceBusReceiverClient receiver = builder
//                .receiver()
//                .queueName(queueName)
//                .buildClient();
//
//        System.out.println("Listening for messages on queue: " + queueName);
//        receiver.receiveMessages(10).forEach(message -> {
//            System.out.println("Received message: " + message.getBody().toString());
//        });
//        receiver.close();
//    }
}
