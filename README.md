# AwsLambdaExample
This is basic AWS Lambda Example

I assume that you have an AWS account. =)

1)  You need to create S3Bucket , this is quite easy to do that. Just go to AWS Console and Type S3 and follow steps.

2)  After That You need to create Lambda Function and than add trigger S3 Bucket. Also, You must upload your code as a zip or jar .

3) Note: control your  Handler : packaName.ClassName::handleRequest    in our example : com.lambda.handler.LambdaHandler::handleRequest

4) Finally, If we wanna test our Lambda Function : we just need to upload  a file , and then go to AWS Console just type : CloudWatch

5) If you are in CloudWatch : check the left side of the window : you may see Log Groups Tab , and then click. You can see  logs of Lambda Function :=).

