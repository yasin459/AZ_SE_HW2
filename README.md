# AZ_SE_HW2
### Yasin Moosavi 98110351
### Matin Moradi 
میخواهیم  TDD پیش برویم پس اول  یک تست میسازیم که فیل میشود زیرا کلاس  reactangle را نداریم:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/aee11d82-2b04-4887-b3ad-2ae00a68ce23)

کلاس rectangle را میسازیم و اینبار به درستی ران میشود:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/a2153986-894c-4665-b48e-4782ea76afb8)

حال باید مساحت را حساب کنیم و تست آن میشود:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/b664b158-fa40-4421-b392-eca97efd66ca)

اما تایع تعریف نشده پس آن را تعریف میکنیم:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/55959874-2e42-4d22-94d6-c115e619ad5f)

اما همچنان فیل میشود پس متغیر های دیگری را هم اضافه میکنیم:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/36706ba5-e37b-4fe7-8b4b-1d1f7ac9ff28)

و تست ما هم میشود: که باز هم فیل میشود چراکه  constructor نداریم:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/e63d6f44-a75d-4c88-9664-348b50b3cbcb)

برای درست کردن آن کد میشود:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/3b238d89-967b-42b5-aba0-e70e2cf0fcfc)

و تست پاس میشود پس تست جدید میسازیم: این دو تست برای بررسی setter  و  getter  هستند، به طور مشابه اینها هم مشکل نبود  getter setter میخورند که با اضافه کردن کد به فایل rectangle درست میشود:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/4145fa20-fd62-46ad-a844-9e95bd6b3abd)


کد getter , setter:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/a7e563ad-7b65-41e0-a92c-1a947e0aab42)

و تست ها پاس میشوند:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/bad1b5c4-494e-4cc2-9ec2-a0adca49fcdd)

حال باید مربع را اضافه کنیم، اول تست آن:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/2e0cfbdc-5a16-4cce-8d08-41c9e70d1fab)

که فیل میشود پس یک کلاس مربع میسازیم:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/f31c659f-b9a9-449d-b192-dd0c00dc590e)

و تست پاس میشود:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/46842f05-3d9b-4e46-9f2e-e30b4e7b2abb)

حال باید تستی جدید بنویسیم که توابع بالا را بتوان روی مربع هم ست کرد برای اینکار دو راه حل داریم، یکی اینکه مربع از مستطیل ارث بری کند که این غلط است و دیگری این است که هردو از یک کلاس  shape  ارث بری کنند. حال دقت کنید که تمام توابعی که برای  rect زدیم باید برای shape و square هم کار کنند پس در گام اول تست های نوشته شده را برای  shape باز نویسی میکنیم: البته ست های قبلی را هم نگه میداریم.

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/7c105e0e-45df-4c36-9861-187ce6a28f23)


بنابراین تمام این توابع را باید بریا  shape  بنویسیم:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/d67eaf5d-1554-4b71-b61f-77a7ea45c947)

و توابع کلاس های Square , Rectangle  را حذف میکنیم:

![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/8bfefbe6-a093-45ed-b8f7-0efa91cb702b)

 حال تست ها را ران میکنیم و میبینیم که تست های  Shape ران میشود و تست های  rectangle ران نمیشود:

 ![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/8a86bdbc-883a-46f7-abd8-ab298073f24b)

 برای تایید شدن این توابع باقی مانده باید rectangle از  shape ارث ببرد:

 ![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/bad1bece-0f93-4962-aa3b-27334dc283a0)

 دوباره ران میکنیم:

 ![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/dd9dbed9-bc47-4a81-971c-7024717772dc)

 حال که همگی  accept شدند، سراغ  square میرویم و برای آن هم ارث بری  را اجرا میکنیم:

 ![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/994ca74e-c86c-41bc-a81c-c4c3d597a3bc)

 و تست ها را دوباره ران میگیریم:

 ![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/5e8663a8-94b8-4c1d-a3e6-4f3d5881d7b9)

 با اینکار همه ی تست ها اکسپت میشود و صرفا تست اخر اکسپت نمیشود که دلیل آن هم این است که به آن ورودی نداده ایم.

 ![image](https://github.com/yasin459/AZ_SE_HW2/assets/60640286/7bf13dc9-3948-4a40-a4f0-7530c6654a95)

 









از آنجا که کلاس  shape همهی 














 



