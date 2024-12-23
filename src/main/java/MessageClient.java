import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import stub.SalutationGrpc;
import stub.SalutationOuterClass;

public class MessageClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();
// Créer un stub asynchrone pour appeler le service
        SalutationGrpc.SalutationStub asyncStub = SalutationGrpc.newStub(channel);
// Observer pour recevoir la réponse du serveur
        StreamObserver<SalutationOuterClass.SalutResponse> responseObserver = new StreamObserver<>() {
            @Override
            public void onNext(SalutationOuterClass.SalutResponse response) {
                System.out.println("Réponse du serveur : " + response.getMessage());
            }
            @Override
            public void onError(Throwable t) {
                System.err.println("Erreur : " + t.getMessage());
            }
            @Override
            public void onCompleted() {
                System.out.println("Communication terminée.");
            }
        };// Observer pour envoyer les messages au serveur
        StreamObserver<SalutationOuterClass.SalutRequest> requestObserver =
                asyncStub.message(responseObserver);
        try {
// Envoyer plusieurs messages au serveur
            requestObserver.onNext(SalutationOuterClass.SalutRequest.newBuilder().setName("Ahmed").build());
            requestObserver.onNext(SalutationOuterClass.SalutRequest.newBuilder().setName("Brahim").build());
            requestObserver.onNext(SalutationOuterClass.SalutRequest.newBuilder().setName("Imane").build());
// Indiquer que tous les messages ont été envoyés
            requestObserver.onCompleted();
        } catch (Exception e) {
            requestObserver.onError(e);
        }
// Attendre un moment pour que le serveur termine la réponse
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
// Fermer le canal
        channel.shutdown();
    }
}

