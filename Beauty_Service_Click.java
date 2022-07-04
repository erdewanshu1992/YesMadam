package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.setup;

public class Beauty_Service_Click extends setup {
    @Test
    public void ByVisibleElement() throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
       WebElement ElementNoida = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/section[3]/div/div/a[1]/div/img"));
       ElementNoida.click();
       Thread.sleep(2000);
       WebElement beautycare = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/section[2]/div/div/div[1]/div[2]/div/a[1]/div/img"));
       beautycare.click();
       System.out.println("The header text is - " +ElementNoida.getText());
       Thread.sleep(2000);
       //driver.switchTo().alert().accept();
       WebElement WaxingSpecial = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[1]/ul/li[1]"));
       WaxingSpecial.click();
       Thread.sleep(2000);
       WebElement makeoverdeal = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[1]/ul/li[2]"));
       makeoverdeal.click();
       Thread.sleep(2000);
       WebElement Facial = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[1]/ul/li[3]"));
       Facial.click();
       Thread.sleep(2000);
       WebElement pedicure = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[1]/ul/li[4]"));
       pedicure.click();
       Thread.sleep(2000);
       WebElement addonInsta = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[1]/ul/li[5]"));
       addonInsta.click();
       Thread.sleep(2000);
       WebElement addoneye = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[1]/ul/li[6]"));
       addoneye.click();
       Thread.sleep(2000);
       WebElement handmask = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[1]/ul/li[7]"));
       handmask.click();
       Thread.sleep(2000);
       WebElement addon = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[1]/ul/li[8]"));
       addon.click();
       Thread.sleep(2000);
       
       WebElement weedingsell = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[2]/a/span"));
       weedingsell.click();
       Thread.sleep(2000);
       WebElement newbegning = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[2]/ul/li[1]"));
       newbegning.click();
       Thread.sleep(2000);
       WebElement sixhundreaddeal = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[2]/ul/li[2]"));
       sixhundreaddeal.click();
       Thread.sleep(2000);
       WebElement elevenhundreaddeal = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[2]/ul/li[3]"));
       elevenhundreaddeal.click();
       Thread.sleep(2000);
       WebElement sexteendeal = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[2]/ul/li[4]"));
       sexteendeal.click();
       Thread.sleep(2000);
       WebElement nindela = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[2]/ul/li[5]"));
       nindela.click();
       Thread.sleep(2000);
       WebElement twentysevendeal = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[2]/ul/li[6]"));
       twentysevendeal.click();
       Thread.sleep(2000);
       WebElement adondealins = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[2]/ul/li[7]"));
       adondealins.click();
       Thread.sleep(2000);
       WebElement addoneys = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[2]/ul/li[8]"));
       addoneys.click();
       Thread.sleep(2000);
       WebElement hndmask = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[2]/ul/li[9]"));
       hndmask.click();
       Thread.sleep(2000);
       WebElement addond = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[2]/ul/li[10]"));
       addond.click();
       Thread.sleep(2000);
       
       WebElement serviceatone = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[3]/a/span"));
       serviceatone.click();
       Thread.sleep(2000);
       WebElement freewikni = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[3]/ul/li[1]"));
       freewikni.click();
       Thread.sleep(2000);
       WebElement freedetan = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[3]/ul/li[2]"));
       freedetan.click();
       Thread.sleep(2000);
       WebElement frehalf = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[3]/ul/li[3]"));
       frehalf.click();
       Thread.sleep(2000);
       WebElement freeheadmassage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[3]/ul/li[4]"));
       freeheadmassage.click();
       Thread.sleep(2000);
       WebElement addonins = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[3]/ul/li[5]"));
       addonins.click();
       Thread.sleep(2000);
       WebElement addone = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[3]/ul/li[6]"));
       addone.click();
       Thread.sleep(2000);
       WebElement hndmasks = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[3]/ul/li[7]"));
       hndmasks.click();
       Thread.sleep(2000);
       WebElement addonA = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[3]/ul/li[8]"));
       addonA.click();
       Thread.sleep(2000);
       WebElement upgrade = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[3]/ul/li[9]"));
       upgrade.click();
       Thread.sleep(2000);
       
       WebElement freeupgreade = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[3]/ul/li[10]"));
       freeupgreade.click();
       Thread.sleep(2000);
       
       WebElement waxing = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[4]/a/span"));
       waxing.click();
       Thread.sleep(2000);
       
       WebElement ricaWax = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[4]/ul/li[1]"));
       ricaWax.click();
       Thread.sleep(2000);
       
       WebElement normalwax = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[4]/ul/li[2]"));
       normalwax.click();
       Thread.sleep(2000);
       
       WebElement ricabrazillain = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[4]/ul/li[3]"));
       ricabrazillain.click();
       Thread.sleep(2000);
       
       WebElement ricaroll = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[4]/ul/li[4]"));
       ricaroll.click();
       Thread.sleep(2000);
       
       WebElement intimatesarvice = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[5]/a/span"));
       intimatesarvice.click();
       Thread.sleep(2000);
       
       WebElement topsellingpackage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[5]/ul/li[1]"));
       topsellingpackage.click();
       Thread.sleep(2000);
       
       WebElement ricabra = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[5]/ul/li[2]"));
       ricabra.click();
       Thread.sleep(2000);
       
       WebElement ricanormal = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[5]/ul/li[3]"));
       ricanormal.click();
       Thread.sleep(2000);
       
       WebElement ricaz = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[5]/ul/li[4]"));
       ricaz.click();
       Thread.sleep(2000);
       
       WebElement normalbikni = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[5]/ul/li[5]"));
       normalbikni.click();
       Thread.sleep(2000);
       WebElement addonc = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[5]/ul/li[6]"));
       addonc.click();
       Thread.sleep(2000);
       WebElement instalight = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[6]/a/span"));
       instalight.click();
       Thread.sleep(2000);
       WebElement ricad = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[6]/ul/li[1]"));
       ricad.click();
       Thread.sleep(2000);
       WebElement ricax = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[6]/ul/li[2]"));
       ricax.click();
       Thread.sleep(2000);
       WebElement ricas = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[6]/ul/li[3]"));
       ricas.click();
       Thread.sleep(2000);
       WebElement facial = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[7]/a/span"));
       facial.click();
       Thread.sleep(2000);
       WebElement icefacial = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[7]/ul/li[1]"));
       icefacial.click();
       Thread.sleep(2000);
       WebElement premiumfacial = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[7]/ul/li[2]"));
       premiumfacial.click();
       Thread.sleep(2000);
       WebElement bridalfacial = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[7]/ul/li[3]"));
       bridalfacial.click();
       Thread.sleep(2000);
       WebElement clicfacial = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[7]/ul/li[4]"));
       clicfacial.click();
       Thread.sleep(2000);
       WebElement luxfacial = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[7]/ul/li[5]"));
       luxfacial.click();
       Thread.sleep(2000);
       
       WebElement cleanup = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[8]/a/span"));
       cleanup.click();
       Thread.sleep(2000);
       WebElement classicleanup = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[8]/ul/li[1]"));
       classicleanup.click();
       Thread.sleep(2000);
       WebElement premiumcleanup = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[8]/ul/li[2]"));
       premiumcleanup.click();
       Thread.sleep(2000);
       WebElement eyeyouth = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[8]/ul/li[3]"));
       eyeyouth.click();
       Thread.sleep(2000);
       WebElement eyepotli = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[8]/ul/li[4]"));
       eyepotli.click();
       Thread.sleep(2000);
       WebElement mask = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[9]/a/span"));
       mask.click();
       Thread.sleep(2000);
       WebElement aglmask = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[9]/ul/li[1]"));
       aglmask.click();
       Thread.sleep(2000);
       WebElement chaecolmask = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[9]/ul/li[2]"));
       chaecolmask.click();
       Thread.sleep(2000);
       WebElement facemask = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[9]/ul/li[3]"));
       facemask.click();
       Thread.sleep(2000);
       WebElement handmaskz = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[9]/ul/li[4]"));
       handmaskz.click();
       Thread.sleep(2000);
       WebElement mainpadi = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[10]/a/span"));
       mainpadi.click();
       Thread.sleep(2000);
       WebElement marg = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[10]/ul/li[1]"));
       marg.click();
       Thread.sleep(2000);
       WebElement manupadicombo = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[10]/ul/li[2]"));
       manupadicombo.click();
       Thread.sleep(2000);
       
       WebElement pedicures = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[10]/ul/li[3]"));
       pedicures.click();
       Thread.sleep(2000);
       
       WebElement manicure = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[10]/ul/li[4]"));
       manicure.click();
       Thread.sleep(2000);
       
       WebElement adon = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[10]/ul/li[5]"));
       adon.click();
       Thread.sleep(2000);
       WebElement dtanblich = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[11]/a/span"));
       dtanblich.click();
       Thread.sleep(2000);
       WebElement bleach = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[11]/ul/li[1]"));
       bleach.click();
       Thread.sleep(2000);
       WebElement massagecream = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[11]/ul/li[2]"));
       massagecream.click();
       Thread.sleep(2000);
       WebElement dtan = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[11]/ul/li[3]"));
       dtan.click();
       Thread.sleep(2000);
       
       WebElement haircolor = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[12]/a/span"));
       haircolor.click();
       Thread.sleep(2000);
       WebElement touchup = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[12]/ul/li[1]"));
       touchup.click();
       Thread.sleep(2000);
       WebElement heena = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[12]/ul/li[2]"));
       heena.click();
       Thread.sleep(2000);
       WebElement cratin = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[13]/a/span"));
       cratin.click();
       Thread.sleep(2000);
       WebElement cratinspa = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[13]/ul/li[1]"));
       cratinspa.click();
       Thread.sleep(2000);
       WebElement hairspapackage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[13]/ul/li[2]"));
       hairspapackage.click();
       Thread.sleep(2000);
       WebElement loral = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[13]/ul/li[3]"));
       loral.click();
       Thread.sleep(2000);
       WebElement loadon = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[13]/ul/li[4]"));
       loadon.click();
       Thread.sleep(2000);
       WebElement threading = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[14]/a/span"));
       threading.click();
       Thread.sleep(2000);
       WebElement thr = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[14]/ul/li[1]"));
       thr.click();
       Thread.sleep(2000);
       WebElement facewax = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[14]/ul/li[2]"));
       facewax.click();
       Thread.sleep(2000);
       WebElement bodypolice = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[15]/a/span"));
       bodypolice.click();
       Thread.sleep(2000);
       WebElement police = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[15]/ul/li[1]"));
       police.click();
       Thread.sleep(2000);
       WebElement scrub = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[15]/ul/li[2]"));
       scrub.click();
       Thread.sleep(2000);
       WebElement wax = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[15]/ul/li[3]"));
       wax.click();
       Thread.sleep(2000);
       WebElement blea = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/ul/li[15]/ul/li[4]"));
       blea.click();
       Thread.sleep(2000);
       
       WebElement Home = driver.findElement(By.xpath("//img[@class=\"logo\"]"));
       Home.click();
       Thread.sleep(2000);
       
       WebElement SalonAt_Home = driver.findElement(By.xpath("(//div[@class=\"service_card\"])[1]"));
       SalonAt_Home.click();
       Thread.sleep(2000);
       
       WebElement makeUP = driver.findElement(By.xpath("//div[@class=\"img_card active\"]"));
       makeUP.click();
       Thread.sleep(2000);
      
       WebElement makeuppackage = driver.findElement(By.xpath("(//div[@class=\"subcat_img\"])[6]"));
       makeuppackage.click();
       Thread.sleep(2000);
       /*
       WebElement Home = driver.findElement(By.xpath(""));
       Home.click();
       Thread.sleep(2000);
       WebElement Home = driver.findElement(By.xpath(""));
       Home.click();
       Thread.sleep(2000);
       WebElement Home = driver.findElement(By.xpath(""));
       Home.click();
       Thread.sleep(2000);
       WebElement Home = driver.findElement(By.xpath(""));
       Home.click();
       Thread.sleep(2000);
       WebElement Home = driver.findElement(By.xpath(""));
       Home.click();
       Thread.sleep(2000);
       WebElement Home = driver.findElement(By.xpath(""));
       Home.click();
       Thread.sleep(2000);
       WebElement Home = driver.findElement(By.xpath(""));
       Home.click();
       Thread.sleep(2000);
       
       
       */
       
       
       
       
       
       
       
       
       
        //WebElement ElementNoida = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/section[9]/div[1]/div/div/span[11]/a"));
        Thread.sleep(4000);

        js.executeScript("arguments[0].scrollIntoView();", ElementNoida);
        Thread.sleep(4000);
        
    }

}
