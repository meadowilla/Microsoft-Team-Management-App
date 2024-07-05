<h1 align="center">Microsoft Team Management App</h1>

<p align="center"><img src="src\main\resources\images\Logo.png" alt="Microsoft Team Management App" width="250" height="250"></p>

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

* Verify your permission

https://github.com/meadowilla/Microsoft-Team-Management-App/assets/130919290/200167e8-85c7-475b-b261-5f207872ac21

* Sync data to your Airtable base
  
https://github.com/meadowilla/Microsoft-Team-Management-App/assets/130919290/a4873ec8-0d97-4c59-a992-3f3032387cc7

* Create a new channel (private, standard, shared)
  
https://github.com/meadowilla/Microsoft-Team-Management-App/assets/130919290/ec85f346-afa1-43a3-acf3-4f42f3e57ae7

* Add new members from CSV file to a team
  
https://github.com/meadowilla/Microsoft-Team-Management-App/assets/130919290/94c9821d-62b4-48bb-80e7-a44b41a0f450

* Add a specific members to a private channel
  
https://github.com/meadowilla/Microsoft-Team-Management-App/assets/130919290/05a8237b-ed29-47e6-91d8-144704d78049

## Technologies Used
### APIs
* **Microsoft Graph, Access Token, Azure App Permissions and Secrets**
  
  Our management application interacts with Microsoft Team through **Microsoft Graph**. 
  
  To call Graph API, our app must obtain an **access token** from the Microsoft identity platform. This access token includes information about whether the app is authorized to access Microsoft Graph with its own identity. With the aim of authorizing our app, we create an Azure app with **proper permisions**, including _Chatp685032@gmail.com


