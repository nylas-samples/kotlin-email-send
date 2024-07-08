// Import Nylas packages
import com.nylas.NylasClient
import com.nylas.models.*

// Import DotEnv to handle .env files
import io.github.cdimascio.dotenv.dotenv

fun main() {
    // Load our env variable
    val dotenv = dotenv()

    // Initialize Nylas client
    val nylas: NylasClient = NylasClient(
        apiKey = dotenv["V3_TOKEN_API"],
        apiUri = dotenv["NYLAS_API_URI"]
    )

    val emailNames : List<EmailName> = listOf(EmailName("<EMAIL_ADDRESS>", "<NAME>"))
    val requestBody : SendMessageRequest = SendMessageRequest.Builder(emailNames).
    subject("With Love, from Nylas").
    body("This email was sent using the <b>Kotlin SDK</b> " +
         " for the Nylas Email API. \n" +
         "Visit <a href='https://nylas.com'>Nylas.com</a> for details.").
    build()
    val email = nylas.messages().send(dotenv["GRANT_ID"],requestBody)
    print(email.data)
}
