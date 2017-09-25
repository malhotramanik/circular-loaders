# circular-loaders
Two simple loaders, to show any progress.

### Build
##### Step 1. Add the JitPack repository to your build file
```build
allprojects {
	repositories {
			...
			maven { url "https://jitpack.io" }
	}
}
```

##### Step 2. Add the dependency
```build
dependencies {
	compile 'com.github.manik2842:circular-loaders:1.4'
}
```

### Usage
##### 1. Simple Progressbar
```java
 ProgressBarLoader progressBarLoader=new ProgressBarLoader(this);
 progressBarLoader.setCancelable(true); //(optional) by default its false
 progressBarLoader.show();
 progressBarLoader.dismiss();
```

##### 2.Rotate Image 
```java
	RotateImageLoader rotateImageLoader=new RotateImageLoader(this,getResources().getDrawable(R.drawable.loaderImage));
	rotateImageLoader.setCancelable(true); //(optional) by default its false
	
	rotateImageLoader.setRotateDuration(3000); //To increase or decrese speed of rotation(optional) by default its 1000
	rotateImageLoader.show();
	rotateImageLoader.dismiss();
```
