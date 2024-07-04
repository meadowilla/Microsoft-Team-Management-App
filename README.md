<h1 align="center">Microsoft Team Management App</h1>

<p align="center"><img src="Logo.png" alt="Microsoft Team Management App" width="250" height="250"></p>

<!-- Add some buttons (License, download, version, madeby, open source, stars, issues) -->

<div align="center">
  <br>A simple and secure app that supports owners managing their own team on Microsoft Team and syncing data to Airtable.<br>
  <sub>Contributed by students from SOICT, HUST.</sub>
</div>

## Description & Features
Dear schools, organizations, or owners, 
Microsoft Team is a popular application for colaborating, and also where your team cooperate everyday. So, managing channels, members of teams you own is an important task to ensure the smoothness and security for organizational activities.

There are several problems to be faced:
* Ensuring specific permissions given to proper employees to do management
* Syncing all data about members and channels of a team to a Airtable base
* Adding new members from a CSV file to a team
* Adding a specific member to a private channel
* Creating a new channel (private, standard, shared)

This Microsoft Team Management App is a secure solution for above-mentioned problems. In terms of security, it is programmed in Java with secure rules applied and supports giving proper managing permissions through an authorized app in Azure. In terms of services/features, the app allows owners to take the last 4 main actions listed above.

## Demo
### Requirements
* **Proper permissions**: 
Ensure that you have the _tenantId_ of your organization and the proper permissions (represented by _clientId_, _clientSecret_ of the corresponding app on Azure) to take managing actions.
* **Own Airtable account (only for syncing task)**: 
Ensure that you have created an Airtable account, then had your _Airtable API key_ and have created a base (_baseId_) and tables (_tableId_).

### Demo Videos
<!-- Consider the order of features presented-->
* Verify your permission
* Sync data to your Airtable base
* Create a new channel (private, standard, shared)
* Add new members from CSV file to a team
* Add a specific members to a private channel

## Technologies Used
### APIs
* **Microsoft Graph, Access Token, Azure App Permissions and Secrets**
  
  Our management application interacts with Microsoft Team through **Microsoft Graph**. 
  
  To call Graph API, our app must obtain an **access token** from the Microsoft identity platform. This access token includes information about whether the app is authorized to access Microsoft Graph with its own identity. With the aim of authorizing our app, we create an Azure app with **proper permisions**, including _Channel.Create_, _ChannelMember.ReadWrite.All_, _TeamMember.ReadWrite.All_, _TeamMember.Read.All_, to allow creating channels, updating members and retrieving information. 
  
  Therefore, our appilication would ask onwers to provide the **Azure app's secrets** to get proper access token before allowing them to use its service.

* **Airtable API**: 
  We utilize Airtable to store information about members and channels retrieved from Microsoft Teams. This is facilitated by the **Airtable API**, a powerful and flexible tool that enables us to interact programmatically with Airtable bases.

### Java Programming
* Usecase Diagram
<p><img src="UML\Total UseCase.png" alt="Usecase Diagram" ></p>

* Class Diagram
<p><img src="UML\Package Dependency.png" alt="Package Dependency"></p>
<p><img src="UML\Entity Classes.png" alt="Entity Classes"></p>
<p><img src="UML\Request Classes.png" alt="Request Classes"></p>
<p><img src="UML\Feature Classes.png" alt="Feature Classes"></p>
<p><img src="UML\Controller Classes.png" alt="Controller Classes"></p>

### Deploying with Jenkins and testing with SonarQube
  Bugs and code smells are represented in our report (Project I.pdf)
## Build
Clone the repo and then run Main.java
## License

## Contact
This project is maintained by 2 moderators:
- NguyenTT - [@meadowilla](https://github.com/meadowilla/) - nguyen.tt220067@sis.hust.edu.vn/nguyen8a1yp@gmail.com
- HaPT - [@hanny](https://github.com/pth0301/) - ha.pt225571@sis.hust.edu.vn/haphan???@gmail.com


