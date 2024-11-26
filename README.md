#  SpotiDogs
> [!NOTE]
> Description of SpotiDogs (Jetpack compose, MVVM, Clean arquitecture, navigation 2.8.0 with Kotlin Serialization, Dagger Hilt, Retrofit, ViewModels, Coil, Room, Firebase).

# Home 

> [!TIP]
> It allows us to register in the app in the Firebase database, either manually with the email/password or through authentication with Google or Facebook.Conventional login with email and password for users already registered in the Firebase database.Allows adding new users to the database.

> 
![Descripción de la imagen](https://drive.google.com/uc?id=1zMxuVRoAYhTEnoHXeVy1cz0QbvNp38BB)
>

# SearchDogsScreen

> [!TIP]
> On this screen we have a topBar with a title and direct access to the photos hosted in the database previously selected by the user and the unlog option. On the screen we can see the different (list) breeds available that the API provides, when clicking on any of them it will load a list of many photos of dogs according to the selected breed.

> 
![Descripción de la imagen](https://drive.google.com/uc?id=1JIH46EI7IywsyZp8X-KaNgPD59pdVYWy)

# BreedScreen

> [!TIP]
> On this screen we can access our photos saved in favorites in both the remote and local databases, which are synchronized. Search for new breeds, by clicking on the search icon or on "Search new Breed" a dialog will open with the available breeds. On the main screen we can see all the photos of the selected breed by loading or removing from favorites using the favorite icon.


> 
![Descripción de la imagen](https://drive.google.com/uc?id=1-tsJMrmZIcbAL6goL20v2YFEb61Q5BBV)
>

# BD REMOTE / LOCAL

> [!TIP]
> In both databases we have the possibility of deleting photos individually with the delete icon for each photo or we can delete the entire database from the delete icon in the topbar.

> 
![Descripción de la imagen](https://drive.google.com/uc?id=1zdai-tsz-5htggfBTfg_Yz-7QpUVl1BG)
>
> 
![Descripción de la imagen](https://drive.google.com/uc?id=1S-C343ZKPiwt1whg0J8N53heaSo4jovG)

# FullScreenPicture

> [!TIP]
> By clicking on any photo we can see it in real size covering the entire size of the screen with the possibility of zooming in and physically downloading it to our device.

> 
![Descripción de la imagen](https://drive.google.com/uc?id=1wEQbDmwv1CneMJNW2a28FKSJm1KHio80)
>
