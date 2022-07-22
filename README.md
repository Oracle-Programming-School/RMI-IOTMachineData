# RMI-IOTMachineData (Example Project of RMI Implementationa and communication Betweeen Client and server)

RMI (Remote Method Invocation)
 The RMI (Remote Method Invocation) is an API that provides a mechanism to create distributed application in java. The RMI allows an object to invoke methods on an object running in another JVM.
Understanding stub and skeleton
RMI uses stub and skeleton object for communication with the remote object.

![Whiteboard](https://user-images.githubusercontent.com/25382318/180447530-9e0802e1-f40a-4511-915f-d4be8806621f.png)



#Start Server
![image](https://user-images.githubusercontent.com/25382318/180445526-4b3f8b65-cc55-4b1b-b715-aa64e6ec27bd.png)

#Run 1st Sensor Client and Client is started to send data to Server
![image](https://user-images.githubusercontent.com/25382318/180445588-50c31f2c-580c-454a-b3c6-4528b8810645.png)

#Run 2nd Sensor Client and Client is started to send data to Server
![image](https://user-images.githubusercontent.com/25382318/180445721-27fde254-0657-4339-9a2e-e8fe87248415.png)

#Data is recieveing on Server from both clients and On server, Threads are working to process these data
![image](https://user-images.githubusercontent.com/25382318/180445780-3ef50008-49b7-4684-bd06-025957a6ec07.png)

#Now End user connected to Server to get the process data. 
![image](https://user-images.githubusercontent.com/25382318/180445987-8cdd4ecf-679e-4cc1-8b00-df694da05d71.png)


