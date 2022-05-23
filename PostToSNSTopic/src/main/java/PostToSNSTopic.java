import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;


public class PostToSNSTopic {

    public static void main(String[] args) {

        AmazonSNSClient snsClient = (AmazonSNSClient) AmazonSNSClientBuilder.standard()
                .withRegion(Regions.US_EAST_1)
                .withCredentials(new DefaultAWSCredentialsProviderChain())
                .build();

        String message = "This is a test message";


    }

}
