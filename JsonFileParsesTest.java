import org.example.JsonFileParser;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author raju.gupta
 * @since Mar-2025
 */
public class JsonFileParsesTest {

    @Test
    public void testParse() {
        final String filePath = "src/main/resources/data.json";
        assertDoesNotThrow(() -> JsonFileParser.parse(filePath));
    }

    @Test
    public void testParseWithAPiResponse() {

        final String apiResponse = "{\n"
            + "  \"actions\": [\n"
            + "    {\n"
            + "      \"id\": \"82;a\",\n"
            + "      \"state\": \"SUCCESS\",\n"
            + "      \"returnValue\": [\n"
            + "        {\n"
            + "          \"developerName\": \"Name__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [\n"
            + "            \"Applicant1__c\"\n"
            + "          ],\n"
            + "          \"metadataType\": \"CustomField\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"parentObject\": \"Applicant1__c\",\n"
            + "            \"dataType\": \"Text\",\n"
            + "            \"label\": \"Name\",\n"
            + "            \"description\": \"Full name of the applicant.\",\n"
            + "            \"length\": 255,\n"
            + "            \"name\": \"Name__c\"\n"
            + "          }\n"
            + "        },\n"
            + "        {\n"
            + "          \"developerName\": \"Email__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [\n"
            + "            \"Applicant1__c\"\n"
            + "          ],\n"
            + "          \"metadataType\": \"CustomField\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"parentObject\": \"Applicant1__c\",\n"
            + "            \"dataType\": \"Email\",\n"
            + "            \"label\": \"Email\",\n"
            + "            \"description\": \"Email address of the applicant.\",\n"
            + "            \"name\": \"Email__c\"\n"
            + "          }\n"
            + "        },\n"
            + "        {\n"
            + "          \"developerName\": \"Position_Applied_For__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [\n"
            + "            \"Applicant1__c\"\n"
            + "          ],\n"
            + "          \"metadataType\": \"CustomField\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"parentObject\": \"Applicant1__c\",\n"
            + "            \"dataType\": \"Text\",\n"
            + "            \"label\": \"Position Applied For\",\n"
            + "            \"description\": \"The specific position the applicant is applying for.\",\n"
            + "            \"length\": 255,\n"
            + "            \"name\": \"Position_Applied_For__c\"\n"
            + "          }\n"
            + "        },\n"
            + "        {\n"
            + "          \"developerName\": \"Application_Date__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [\n"
            + "            \"Applicant1__c\"\n"
            + "          ],\n"
            + "          \"metadataType\": \"CustomField\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"parentObject\": \"Applicant1__c\",\n"
            + "            \"dataType\": \"Date\",\n"
            + "            \"label\": \"Application Date\",\n"
            + "            \"description\": \"Date when the application was submitted.\",\n"
            + "            \"name\": \"Application_Date__c\"\n"
            + "          }\n"
            + "        },\n"
            + "        {\n"
            + "          \"developerName\": \"Status__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [\n"
            + "            \"Applicant1__c\"\n"
            + "          ],\n"
            + "          \"metadataType\": \"CustomField\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"parentObject\": \"Applicant1__c\",\n"
            + "            \"dataType\": \"Picklist\",\n"
            + "            \"label\": \"Status\",\n"
            + "            \"description\": \"Current status of the application.\",\n"
            + "            \"picklistValues\": [\n"
            + "              \"Submitted\",\n"
            + "              \"Under Review\",\n"
            + "              \"Interview Scheduled\",\n"
            + "              \"Offer Extended\"\n"
            + "            ],\n"
            + "            \"name\": \"Status__c\"\n"
            + "          }\n"
            + "        },\n"
            + "        {\n"
            + "          \"developerName\": \"Applicant1__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [],\n"
            + "          \"metadataType\": \"CustomEntity\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"pluralLabel\": \"Applicants\",\n"
            + "            \"description\": \"Stores information about individuals applying for open positions.\",\n"
            + "            \"label\": \"Applicant\",\n"
            + "            \"name\": \"Applicant1__c\"\n"
            + "          }\n"
            + "        },\n"
            + "        {\n"
            + "          \"developerName\": \"Interview_Date__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [\n"
            + "            \"Interview1__c\"\n"
            + "          ],\n"
            + "          \"metadataType\": \"CustomField\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"parentObject\": \"Interview1__c\",\n"
            + "            \"dataType\": \"DateTime\",\n"
            + "            \"label\": \"Interview Date\",\n"
            + "            \"description\": \"Date and time of the scheduled interview.\",\n"
            + "            \"name\": \"Interview_Date__c\"\n"
            + "          }\n"
            + "        },\n"
            + "        {\n"
            + "          \"developerName\": \"Interviewer__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [\n"
            + "            \"Interview1__c\"\n"
            + "          ],\n"
            + "          \"metadataType\": \"CustomField\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"parentObject\": \"Interview1__c\",\n"
            + "            \"dataType\": \"Text\",\n"
            + "            \"label\": \"Interviewer\",\n"
            + "            \"description\": \"Name of the interviewer conducting the interview.\",\n"
            + "            \"length\": 255,\n"
            + "            \"name\": \"Interviewer__c\"\n"
            + "          }\n"
            + "        },\n"
            + "        {\n"
            + "          \"developerName\": \"Applicant__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [\n"
            + "            \"Interview1__c\",\n"
            + "            \"Applicant1__c\"\n"
            + "          ],\n"
            + "          \"metadataType\": \"CustomField\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"parentObject\": \"Interview1__c\",\n"
            + "            \"dataType\": \"Lookup\",\n"
            + "            \"label\": \"Applicant\",\n"
            + "            \"description\": \"Relates to the Applicant entity.\",\n"
            + "            \"deleteConstraint\": \"SetNull\",\n"
            + "            \"relationshipLabel\": \"Applicant__c\",\n"
            + "            \"relationshipName\": \"Applicant__c\",\n"
            + "            \"name\": \"Applicant__c\",\n"
            + "            \"lookupObject\": \"Applicant1__c\"\n"
            + "          }\n"
            + "        },\n"
            + "        {\n"
            + "          \"developerName\": \"Interview1__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [],\n"
            + "          \"metadataType\": \"CustomEntity\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"pluralLabel\": \"Interviews\",\n"
            + "            \"description\": \"Records details of interviews scheduled for applicants.\",\n"
            + "            \"label\": \"Interview\",\n"
            + "            \"name\": \"Interview1__c\"\n"
            + "          }\n"
            + "        },\n"
            + "        {\n"
            + "          \"developerName\": \"Offer_Date__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [\n"
            + "            \"Job_Offer__c\"\n"
            + "          ],\n"
            + "          \"metadataType\": \"CustomField\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"parentObject\": \"Job_Offer__c\",\n"
            + "            \"dataType\": \"Date\",\n"
            + "            \"label\": \"Offer Date\",\n"
            + "            \"description\": \"Date when the job offer was extended.\",\n"
            + "            \"name\": \"Offer_Date__c\"\n"
            + "          }\n"
            + "        },\n"
            + "        {\n"
            + "          \"developerName\": \"Salary_Offered__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [\n"
            + "            \"Job_Offer__c\"\n"
            + "          ],\n"
            + "          \"metadataType\": \"CustomField\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"parentObject\": \"Job_Offer__c\",\n"
            + "            \"dataType\": \"Number\",\n"
            + "            \"label\": \"Salary Offered\",\n"
            + "            \"description\": \"The salary amount offered in the job offer.\",\n"
            + "            \"precision\": 12,\n"
            + "            \"scale\": 5,\n"
            + "            \"name\": \"Salary_Offered__c\"\n"
            + "          }\n"
            + "        },\n"
            + "        {\n"
            + "          \"developerName\": \"Applicant__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [\n"
            + "            \"Job_Offer__c\",\n"
            + "            \"Applicant1__c\"\n"
            + "          ],\n"
            + "          \"metadataType\": \"CustomField\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"parentObject\": \"Job_Offer__c\",\n"
            + "            \"dataType\": \"Lookup\",\n"
            + "            \"label\": \"Applicant\",\n"
            + "            \"description\": \"Relates to the Applicant entity.\",\n"
            + "            \"deleteConstraint\": \"SetNull\",\n"
            + "            \"relationshipLabel\": \"Applicant__c\",\n"
            + "            \"relationshipName\": \"Applicant__c\",\n"
            + "            \"name\": \"Applicant__c\",\n"
            + "            \"lookupObject\": \"Applicant1__c\"\n"
            + "          }\n"
            + "        },\n"
            + "        {\n"
            + "          \"developerName\": \"Job_Offer__c\",\n"
            + "          \"isExisting\": false,\n"
            + "          \"dependencies\": [],\n"
            + "          \"metadataType\": \"CustomEntity\",\n"
            + "          \"propertiesContainer\": {\n"
            + "            \"pluralLabel\": \"Job Offers\",\n"
            + "            \"description\": \"Contains information about job offers extended to applicants.\",\n"
            + "            \"label\": \"Job Offer\",\n"
            + "            \"name\": \"Job_Offer__c\"\n"
            + "          }\n"
            + "        }\n"
            + "      ],\n"
            + "      \"error\": []\n"
            + "    }\n"
            + "  ],\n"
            + "  \"context\": {\n"
            + "    \"mode\": \"PROD\",\n"
            + "    \"app\": \"app_manager:playground\",\n"
            + "    \"pathPrefix\": \"\",\n"
            + "    \"fwuid\": \"Z0pYWkM1a2F1QlhiZU9DOWtvbURvQWdLNVAwNUkzRVNnOFJ1eVRYdHBvVVExMi40MTk0MzA0LjA\",\n"
            + "    \"mlr\": 1,\n"
            + "    \"uad\": 1,\n"
            + "    \"coos\": 1,\n"
            + "    \"loaded\": {\n"
            + "      \"APPLICATION@markup://app_manager:playground\": \"802_ZwbzAY51BJTMwDTe98G8Iw\"\n"
            + "    },\n"
            + "    \"enableAccessChecks\": true,\n"
            + "    \"dns\": \"c\",\n"
            + "    \"ls\": 1,\n"
            + "    \"lairn\": [],\n"
            + "    \"laerc\": [],\n"
            + "    \"lav\": \"64\",\n"
            + "    \"ln\": 1,\n"
            + "    \"csp\": 1,\n"
            + "    \"lgef\": [\n"
            + "      \"com.salesforce.locker.enableImmediateGlobalObjectPatching\",\n"
            + "      \"com.salesforce.locker.enableTrustedTypesScript\",\n"
            + "      \"com.salesforce.locker.enableTrustedModeLegacy\",\n"
            + "      \"com.salesforce.locker.enableTrustedMode\",\n"
            + "      \"com.salesforce.locker.enabledChangesSince.256\",\n"
            + "      \"com.salesforce.locker.temporaryGate\",\n"
            + "      \"com.salesforce.locker.enableSfdcLiveObject\"\n"
            + "    ],\n"
            + "    \"mna\": {\n"
            + "      \"lightning\": \"interop\"\n"
            + "    },\n"
            + "    \"arse\": 1,\n"
            + "    \"acaf\": 1,\n"
            + "    \"services\": [\n"
            + "      \"markup://lightning:configProvider\",\n"
            + "      \"markup://force:salesforceScopedModuleResolver\",\n"
            + "      \"markup://force:ldsEngineCreator\",\n"
            + "      \"markup://instrumentation:locatorService\",\n"
            + "      \"markup://force:lwcScopedModuleResolver\"\n"
            + "    ]\n"
            + "  },\n"
            + "  \"perfSummary\": {\n"
            + "    \"version\": \"core\",\n"
            + "    \"request\": 61,\n"
            + "    \"actions\": {\n"
            + "      \"82;a\": {\n"
            + "        \"total\": 22,\n"
            + "        \"db\": 0\n"
            + "      }\n"
            + "    },\n"
            + "    \"actionsTotal\": 22,\n"
            + "    \"overhead\": 0\n"
            + "  }\n"
            + "}";

        assertDoesNotThrow(() -> JsonFileParser.parseApiResponse(apiResponse));


    }
}
