# Automation-web-ui-Solvd

# HOW TO INTEGRATE: Jenkins ↔ Allure report
<img src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/61bfe9cb-239c-4488-bf1e-f995f07ae8a4/portrait.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20221025%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20221025T140210Z&X-Amz-Expires=86400&X-Amz-Signature=9cbc87fd99c8b5ea64c0ce5302a9e9112c9f101d1526f2bf4fb7b001e0747e99&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22portrait.png%22&x-id=GetObject"/>

### What is Jenkins?

Jenkins is an open-source automation tool written in Java with plugins built for Continuous Integration purposes. Jenkins is used to build and test your software projects continuously making it easier for developers to integrate changes to the project, and making it easier for users to obtain a fresh build. It also allows you to continuously deliver your software by integrating with a large number of testing and deployment technologies.

source: [https://www.edureka.co/blog/what-is-jenkins/](https://www.edureka.co/blog/what-is-jenkins/)

### What is Allure report?

Allure Report is a flexible, lightweight multi-language test reporting tool. It provides clear graphical reports and allows everyone involved in the development process to extract the maximum of information from the everyday testing process.

source: [https://github.com/allure-framework/allure2](https://github.com/allure-framework/allure2)

### Steps:

1. **Register on Jenkins (optional)**
2. **Download Jenkins**
3. **Install Jenkins**
4. **Go to http://localhost:8080**
5. **Login to Jenkins using admin parameters**
6. **How to configure Jenkins to run your tests**
7. **Add Allure maven dependency to you POM.xml**
8. **Download Allure plugin from Jenkins → Manage Jenkins → Manage Plugins**
9. **Restart Jenkins**
10. **Configure allure reports**

### 1st Step: register on Jenkins (optional)**

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Ffa407619-6c4b-4401-a7c6-35dd01578884%2Fjenkins_signup.png?table=block&id=ae228125-d292-4228-8138-2a49cd72bf95&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=1340&userId=&cache=v2"/>

### 2nd Step: download Jenkins

Go to Jenkins webpage and download the last version available:
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F6bea532b-3813-4b39-96b7-3bf1205170e3%2Fjenkins-download.png?table=block&id=62c6eede-2186-4de0-8d9f-068a537763ca&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
As Jenkins says I highly recommend to download a LTS (long term support) version.

### 3rd Step: install Jenkins
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F19417a72-f9a3-4ca3-bce5-5e6b904610df%2F1.png?table=block&id=6a731e62-44fa-4f5a-b974-8787d0143859&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F65f81a6e-1c2f-4105-8014-7dd757fa9ac9%2F2.png?table=block&id=689d12c3-1081-45e7-9f15-f95d1a22f0bd&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
Here you should enter your user and password of Windows but if you want you can select to Run services as LocalSystem even though is not recommended.
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F52498133-2b6d-420c-a850-a867e2f04ae1%2F3.png?table=block&id=7ff6b0ec-0710-4132-ab79-4a33bf6ca3a3&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F02be1ce2-0e25-4d1c-bafc-8c689674cae6%2F4.png?table=block&id=24ace5c4-a885-4437-9bf7-53835e2d8640&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fe46fe96d-960c-4813-a1a2-03436262b2db%2F5.png?table=block&id=e0d6e51a-e344-4674-ae7e-b1e0d91f8bb2&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fd6e1a30c-75dc-494e-8da9-7d86373ebebd%2F6.png?table=block&id=c5e9926b-68c2-4bc7-93df-ed49f7a646f1&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F44157f91-37e4-4b48-b887-bad7069633e1%2F7.png?table=block&id=846fe761-3a29-48ec-b6fb-7c43cc68b093&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F26a4c52e-b712-4e44-b942-dd704b8dc8ff%2F8.png?table=block&id=a7d6e79d-8580-4757-bd82-13b5a3072181&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F479ad252-21b7-4d46-ad68-277127f281f4%2F9.png?table=block&id=fadb31a5-fdd7-47ec-ae69-0b1c91d1af67&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=980&userId=&cache=v2"/>
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F83d1c4e4-0ead-4b96-a110-5c8dc3faf8c9%2F10.png?table=block&id=ee0c654d-e66c-479c-8dc5-c6cf0fab81fe&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

### 4th Step: go to http//:localhost:{port}/


The first time you access to Jenkins you will be asked to unlock it, using a secret initial admin password that is inside the file initialAdminPassword, located in your Jenkins home directory.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F59deee44-bdcb-487f-a5d8-0aa81af9b581%2Funlock_jenkins.png?table=block&id=e1230be0-a99f-4717-b693-51ed5806f44e&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Once you unlocked Jenkins you can choose between install suggested plugins and select what plugins you want to install.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fddee1e08-1770-4899-af12-b8c399d3ee32%2Funknown.png?table=block&id=e554fd32-b857-4cce-9a71-9eca6e4d4835&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

We recommend to install suggested plugins, after that Jenkins will install the plugins.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F04419dfa-5b3d-45cd-96fd-281870fdce22%2Funknown_(1).png?table=block&id=abd06be2-799e-450c-bb72-f5ff4bdf5b23&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

And then you can finally create the admin user and password that you will need to login to Jenkins.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F20755702-2f6e-4c8d-8df9-6ebab495af7f%2Funknown_(2).png?table=block&id=15866bd7-d99a-4f2c-8412-f5cab04c5144&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Here you can change the URL for Jenkins, then click Save and Finish.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fd10624d9-e6f6-4289-bbc5-c9cbd4d0d483%2Funknown_(3).png?table=block&id=1f0c7c0f-9db9-4b6c-ac77-ef869757b724&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

### 5th Step: login to Jenkins

Go to [localhost:8080](http://localhost:8080) (if you used the default port) in your browser and finally you can login to Jenkins using the admin username and password.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fdf11c942-9527-407e-b274-4696be5bf336%2Fjenkins-download.png?table=block&id=2f9d6fcb-329c-45cf-b895-4557d0ae43c6&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

### 6th Step: configure Jenkins to run your tests.

First you need to create a New Build Job, after you log in to Jenkins click on New Items, there will be 6 options (at this moment) enter a name and select Freestyle Project and then click OK.

The freestyle build job is a highly flexible option.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F4b5848c1-5f5c-4abb-a402-c65a9d359e15%2Fexample-project.png?table=block&id=28de7c1a-8b5e-449b-8faa-fde7fe86424a&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

After that you will be redirected to homepage of the build that you created, here you’ve got tons of options but for now go ahead and click Configure.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F2b5930eb-e443-40f7-b235-eb95d1e20b61%2Fexample-project.png?table=block&id=bc594ffa-523d-47ca-ba90-3a8cc7ecdf9a&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Now you can add a simple description for the project (that is up to you), for now let’s keep it simple and click on “Discard old builds”  and in Source Code Management choose “Git”.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fb0975dd4-3d2e-482a-be86-9a7c30010392%2Fexample-project.png?table=block&id=86c1fe4c-1e82-4761-9eb9-4b677b090f75&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

**Discard old builds:** here you can set the number of days you want to keep the old builds, or you can leave it empty and set a number of executions instead. In my opinion if it’s for a personal project I would choose to set a number of executions, so lets do that and put 30 executions.

But if you want you can have both at the same time (e.g. keep builds for 14 days, but only up to a limit of 50 builds, if either limit is exceeded, then any builds beyond that limit will be discarded).

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F8156c67e-34ef-4ba0-9350-54a6f493b9d5%2Fexample-project.png?table=block&id=ab23d6d5-9eb3-44af-8ca7-941439b05611&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

And then you can click on “GitHub project”, go to your repository on GitHub and copy the URL without the tree/master or tree/branch part (e.g. https://github.com/example/example )

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F10e28d1c-7699-4a60-b741-7c97b7698521%2FUntitled.png?table=block&id=4f4f840f-a406-4b2d-886d-ffcbd28524d0&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Source Code Management: in this section click again on Git, paste the link to your repository inside “Repository URL” then scroll down to “Branches to build” and specify the branch that you want to execute the tests from jenkins (e.g. */development). The rest of the options leave it as it is.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F317ff526-bae4-412c-81b6-d8fc410dbe76%2FUntitled.png?table=block&id=c93c224e-1ea6-4487-a2d4-f172c4a15861&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fd5c75aa0-9ec5-4be6-b20c-1b2eef0ea3ce%2FUntitled.png?table=block&id=6a0f6bcd-10ed-4f3a-99d8-b1cd3fabe902&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Build Steps: in this section click on “Add build step” and then go ahead and select Invoke-top-level Maven targets and inside it click on advanced.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F87ee5c42-8823-424a-b9d2-d4e319fd5962%2FUntitled.png?table=block&id=8db78d26-566f-402f-91d3-7540b8f043e9&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Inside of Goals you have to tell jenkins what to do (e.g. clean test, that will execute all of your tests in your project) then in POM put the name of your POM.xml and for now that's it for the Build Steps.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F3d70b87f-93ae-4aba-ae00-863a00e77e5a%2FUntitled.png?table=block&id=79501d98-3c1b-4a9c-82d9-76830447ab9c&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Finally, now you can go back to your Dashboard → {Project name} and click on Build Now.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F93ff9d77-bec8-4c47-9fd6-d96f15144a93%2Fexample-project.png?table=block&id=971e327d-69ce-44ba-8f63-05dd3a067e29&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Now after jenkins download the dependencies and executes all the tests you will be able to see the results of your execution, if you want to see the console output click on the #1 below Build History or you can click on Last Build (#1).

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F2012f26b-f7a3-4997-9567-6db39a291632%2Fexample-project.png?table=block&id=3d7426c6-fd4f-4c1c-b2fc-f258152bad8f&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Here you can see who ran the build and some other information, you can play around and see what else jenkins has. Click Console Output to see which test passed and which failed.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fa3018bdf-4591-44ea-ab41-0436ced04b4f%2FUntitled.png?table=block&id=1eb0a1d8-9eff-4aed-b013-930be6738197&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

This Build execution was marked as failure because it has some tests that do not pass. That’s it for how to configure Jenkins to run your tests, now we can move on and start with the Allure.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F49ce55d4-7fc8-48fa-af62-cb711d418e83%2FUntitled.png?table=block&id=ebe58b08-f537-4bbc-aec4-a65a397da060&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F59a9a2f5-c9e8-41f6-b6b0-1c4d790fa93e%2FUntitled.png?table=block&id=4ab37091-5df8-4d02-b98b-0cbf27a4ec50&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

### 7th Step: adding Allure to our Maven dependencies

Go to mvn-repository and select the last version, copy and paste the dependency in your POM.xml

[https://mvnrepository.com/artifact/io.qameta.allure/allure-testng](https://mvnrepository.com/artifact/io.qameta.allure/allure-testng)

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Faa051ddc-d20c-4df5-8919-0252cd3f381d%2Fexample-project.png?table=block&id=603d3107-d777-4ce2-b283-2d35002e3497&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

After you add the dependency you have to run your tests or suite before the folder “allure-reports” appears in your project (it’s not necessary to run it from your IDE, you can do it through Jenkins).

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fb9aea670-fc52-4ed6-8f60-7d40192eb439%2Fexample-project.png?table=block&id=ba479e92-cef7-4d0f-b83e-9ffcf28af967&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Now that you have checked that the folder appears in the project go back to Jenkins and if you want to been able to access it from there we have to install the allure plugin.

### 8th Step: how to add allure plugin from Jenkins

Go to Jenkins homepage by clicking on the dashboard button in the upper-left corner.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fd6688f07-bd8a-467a-b506-4c80b9a2475c%2Fexample-project.png?table=block&id=a625b768-09de-4413-8802-5c2a817da6c2&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
In dashboard look for Manage Jenkins and click it and then click on Manage plugins

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fa547b161-6cbc-4c8c-bbdc-e633112a28d3%2Fexample-project.png?table=block&id=09fdb22d-240d-4880-b7ad-80cc5da80eb4&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Click on Available (Jenkins use the same language of your browser so if you don’t have in english you should change it or download the Locale plugin to change Jenkins language). Now inside of search put Allure Jenkin Plugin.
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fed212da2-4e54-4c1c-a0f1-f5a2a746cf11%2Fexample-project.png?table=block&id=e823eee4-68e4-4407-aef0-6ba34cca60cc&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Click on the checkbox and then click Download now and Install after restart, so you don’t have to restart Jenkins by yourself (it’s probably that Jenkins ask you again for username and password).

### 9th Step: how to restart Jenkins if you choose to Install without restart

You have to edit your URL and add /restart to it and press enter.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Ffdf8ab1a-6112-4357-aefa-97faf2f20401%2FUntitled.png?table=block&id=8c262b71-3d7a-43c5-811e-55ef5b560d10&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

### 10th Step: how to configure Allure plugin

Now go back to Dashboard and go to Manage Jenkins and click on Global Tool Configuration, scroll down to the end and there it should be Allure Commandline then click on Add Allure Commandline

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F977ad083-dc3a-41f7-a134-8e23a1180bbb%2Fexample-project.png?table=block&id=c0cf0111-d265-405d-b5e5-723db466b452&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Here you have to give it a name and in Version select the exact same version that appears in the dependency that is in your POM.xml

Inside your Job project go again to Configure and scroll down until you see **Post-build Actions** and select Allure Report**.**

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fe6b3e5c1-d6ac-45ce-9449-5b251c7d3b97%2Fexample-project.png?table=block&id=7d038410-e298-479c-b1bc-c6745ea0a170&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F2820e6bc-761f-4e76-95ce-fe71495a44b1%2Fexample-project.png?table=block&id=c505c025-0734-45bb-aa9d-5ff548eadeb0&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
Inside of Path you have to pass the route to your allure-results folder inside your project and that’s it for Allure Report here.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F06ccc808-a89f-4446-a2ca-a42e7413b9ad%2FUntitled.png?table=block&id=8ac01063-1fba-457a-a718-f93e8cfd5d97&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>

Once you've done this go and build again your project, you should see this icon now.
<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2F6fd626aa-434f-4437-bb80-4250fb72feb8%2FUntitled.png?table=block&id=5a36db16-2d8e-4e6f-865a-2b6f5ffc1470&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>
If you click on Allure Report without building again you probably will see 404 error, after that you can click on the icon in Build History or the one below your Project {name}.

<img src="https://juanpg.notion.site/image/https%3A%2F%2Fs3-us-west-2.amazonaws.com%2Fsecure.notion-static.com%2Fe9d7ede0-df68-40b5-8270-71b260f25ea8%2FUntitled.png?table=block&id=e77122e8-5f66-4cc6-86ea-17b2a826cafb&spaceId=93abeace-b278-48fc-b54d-36c0272960d3&width=2000&userId=&cache=v2"/>




