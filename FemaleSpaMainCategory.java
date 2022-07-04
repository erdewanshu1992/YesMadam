package appiumtestForCustomerApp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FemaleSpaMainCategory extends AppiumTestSetUP {
	@Test(priority=1)
	 public void winterSpecial() throws IOException, InterruptedException {
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView")).click();
	    wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();//if got first date
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/time")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/yes")).click();
	    Thread.sleep(2000);
	    System.out.println("Run wenter Specilal services...");
	    
	}
	
	@Test(priority=2)
	public void backButttonForwinterSpecial() throws IOException, InterruptedException {
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
		System.out.println("Run Back Button for wenter Specilal services...");
	}
	
	@Test(priority=3)
	public void bestSeller() throws InterruptedException {
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/time")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/yes")).click();
	    Thread.sleep(2000);
	    System.out.println("Run BestSeller services...");
	}
	
	@Test(priority=4)
	public void backButttonForbestSeller() throws IOException, InterruptedException {
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
		System.out.println("Run Back Button for BestSeller services...");
	}
	@Test(priority=5)
	public void ymPremiumThrapes() throws InterruptedException {
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.ImageView")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/time")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/yes")).click();
	    Thread.sleep(2000);
	    System.out.println("Run YM Premium Thrapes services....");
  }
	@Test(priority=6)
	public void backButttonForpreymPremiumThrapes() throws IOException, InterruptedException {
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
		System.out.println("Run Back Button for YM Premium Thrapes services...");
		
  }
	@Test(priority=7)
	public void bodyPollishingSpa() throws InterruptedException {
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.ImageView")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/time")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/yes")).click();
	    Thread.sleep(2000);
	    System.out.println("Run Body Pollishing services...");
  }
	@Test(priority=8)
	public void backButttonForbodyPollishingSpa() throws IOException, InterruptedException {
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
		System.out.println("Run Back Button for Body Pollishing services...");

  }
	@Test(priority=9)
	public void anyServices556() throws InterruptedException {
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.ImageView")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/time")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/yes")).click();
	    Thread.sleep(2000);
	    System.out.println("Run 556 services...");
  }
	@Test(priority=10)
	public void backButttonForanyServices556() throws IOException, InterruptedException {
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
		System.out.println("Run Back Button for 556 services...");

  }
	@Test(priority=11)
	public void anyServices656() throws InterruptedException {
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.ImageView")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/time")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/yes")).click();
	    Thread.sleep(2000);
	    System.out.println("Run 656 services...");
  }
	@Test(priority=12)
	public void backButttonForanyServices656() throws IOException, InterruptedException {
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
		System.out.println("Run Back Button for 656 services...");

  }
	@Test(priority=13)
	public void addOn() throws InterruptedException {
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.FrameLayout/android.widget.ImageView")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
		wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/add_to_cart")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/time")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/vCheckout")).click();
	    wd.findElement(By.id("yesmadamservices.app.com.yesmadamservices:id/yes")).click();
	    Thread.sleep(2000);
	    System.out.println("Run addON services...");
  }
	@Test(priority=14)
	public void backButttonForanyaddOn() throws IOException, InterruptedException {
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
		System.out.println("Run Back Button for addON services...");

  }
	
	
    }
	
	


