package appiumtestForCustomerApp;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

  public class BeautyCareMainCategory extends AppiumTestSetUP {
	
	@Test(priority=1)
	 public void services() throws IOException, InterruptedException {
	    wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
       	wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();//if got first date
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/time")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/yes")).click();
	    Thread.sleep(2000);
	    System.out.println("Run Best Sellers services....");
	    
	}
	@Test(priority=2)
	public void backButttonForBeautyCare() throws IOException, InterruptedException {
		wd.findElement(By.className("android.widget.ImageButton")).click();//payment
		Thread.sleep(2000);
		wd.findElement(By.className("android.widget.ImageButton")).click();//schedule
		Thread.sleep(2000);
		wd.findElement(By.className("android.widget.ImageButton")).click();//service cart
		Thread.sleep(2000);
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/cart_item_count")).click();//header cart
		Thread.sleep(2000);
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vRemove")).click();//remove cart
		Thread.sleep(2000);
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/btn_positive")).click();//pop up
		Thread.sleep(2000);
		wd.findElement(By.className("android.widget.ImageButton")).click();//back to service page
		Thread.sleep(2000);
		System.out.println("Run Back Button for Best Sellers services...");
	}
	
	@Test(priority=3)
	public void makeUP() throws InterruptedException {
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
       	wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/time")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/yes")).click();
	    Thread.sleep(2000);
	    System.out.println("Run MakeUP Package....");
	}
	
	@Test(priority=4)
	public void backButttonForMakeUP() throws IOException, InterruptedException {
		wd.findElement(By.className("android.widget.ImageButton")).click();//payment
		Thread.sleep(2000);
		wd.findElement(By.className("android.widget.ImageButton")).click();//schedule
		Thread.sleep(2000);
		wd.findElement(By.className("android.widget.ImageButton")).click();//service cart
		Thread.sleep(2000);
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/cart_item_count")).click();//header cart
		Thread.sleep(2000);
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vRemove")).click();//remove cart
		Thread.sleep(2000);
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/btn_positive")).click();//pop up
		Thread.sleep(2000);
		wd.findElement(By.className("android.widget.ImageButton")).click();//back to service page
		Thread.sleep(2000);
		System.out.println("Run Back Button for MakeUP Package...");
	}
	@Test(priority=5)
	public void preBridal() throws InterruptedException {
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/time")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/yes")).click();
	    Thread.sleep(2000);
	    System.out.println("Run preBridal premium services...");
   }
	@Test(priority=6)
	public void backButttonForpreBridal() throws IOException, InterruptedException {
		wd.findElement(By.className("android.widget.ImageButton")).click();//payment
		Thread.sleep(2000);
		wd.findElement(By.className("android.widget.ImageButton")).click();//schedule
		Thread.sleep(2000);
		wd.findElement(By.className("android.widget.ImageButton")).click();//service cart
		Thread.sleep(2000);
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/cart_item_count")).click();//header cart
		Thread.sleep(2000);
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vRemove")).click();//remove cart
		Thread.sleep(2000);
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/btn_positive")).click();//pop up
		Thread.sleep(2000);
		wd.findElement(By.className("android.widget.ImageButton")).click();//back to service page
		Thread.sleep(2000);
		System.out.println("Run back Button for preBridal premium services...");
   }
	
  }