import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.PublishRequest;


public class PostToSNSTopic {

    public static void main(String[] args) {

        AmazonSNSClient snsClient = (AmazonSNSClient) AmazonSNSClientBuilder.standard()
                .withRegion(Regions.US_EAST_1)
                .withCredentials(new DefaultAWSCredentialsProviderChain())
                .build();

        String message = "Hello from Robeel's Java App!";
        // topicArn will have to be changed from topic in playground -> topic in personal AWS account
        String topicArn = "arn:aws:sns:us-east-1:367780398197:Testing-Topic";
        PublishRequest publishRequest = new PublishRequest(topicArn, message);

        snsClient.publish(publishRequest);
        System.out.println("Successfully published message to SNS Topic");


    }

}
