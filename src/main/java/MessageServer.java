import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class MessageServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090)
                .addService(new MessageService())
                .build();
        server.start();
        System.out.println("Serveur gRPC en cours d'exécution sur le port "+server.getPort());
        server.awaitTermination();
    }
}