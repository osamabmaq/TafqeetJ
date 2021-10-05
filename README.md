[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.osamabmaq/TafqeetJ/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.osamabmaq/TafqeetJ)


# TafqeetJ

<p dir='rtl' align='right'>
هذه مكتبة برمجية مكتوبة بلغة البرمجة جافا وهي مختصة بتفقيط الأعداد - أي تحويل العدد من الصيغة المكتوبة بالأرقام إلى الصيغة المكتوبة بالكلمات: وهي مفتوحة المصدر ومرخصة برخصة معهد ماساتشوستس للتكنولوجيا.
</p>

<p dir='rtl' align='right'>
تدعم هذه المكتبة الأرقام السالبة والموجبة، العشرية والصحيحة. يمكنها تفقيط رقم مكون من 15 خانة كحد أقصى على يسار الفاصلة العشرية، و 15 خانة أخرى كحد أقصى على يمين الفاصلة العشرية.
</p>

<p dir='rtl' align='right'>
تدعم هذه المكتبة أنواع البيانات العددية الصحيحة التالية:
</p>

- int
- byte
- short
- long
- BigInteger

<p dir='rtl' align='right'>
أما بالنسبة للأعداد العشرية، فالنوع الوحيد المدعوم هو:
</p>

- BigDecimal

<p dir='rtl' align='right'>
ولم يتم دعم أنواع البيانات البدائية/الأولية العشرية الأخرى لصعوبة التعامل مع الأرقام على يمين الفاصلة فيها بسبب مشاكل التمثيل الثنائي لها في ذاكرة الحاسوب.
</p>

<p dir='rtl' align='right'>
كيف تستخدم هذه المكتبة ؟
</p>

<p dir='rtl' align='right'>
هنالك واجهتان مخصصتان ليتعامل المستخدم مع هذه المكتبة، الأولى هي:
</p>

- TafqeetRangeChecker class

<p dir='rtl' align='right'>
هذا الكلاس مخصص لتستخدمه في التحقق ما إذا كانت المكتبة تستطيع تفقيط عدد ما قبل إرساله إلى دوال الكلاس Tafqeet، وذلك لتجنب رمي استثناء.
</p>

<p dir='rtl' align='right'>
والواجهة الثانية هي:
</p>

- Tafqeet class

<p dir='rtl' align='right'>
ويحوي هذا الكلاس الدوال اللازمة لتفقيط جميع أنواع البيانات المدعومة.
</p>

<p dir='rtl' align='right'>
مثال:
</p>

```java
Tafqeet tafqeet = Tafqeet.getInstance();
if (!TafqeetRangeChecker.isOutOfRange(-999_999_999_999_999L)
    System.out.println(tafqeet.doTafqeet(-999_999_999_999_999L));
```

<p dir='rtl' align='right'>
النتيجة:
</p>


```
سالب تسعمئة وتسعة وتسعين ترليونًا وتسعمئة وتسعة وتسعين مليارًا وتسعمئة وتسعة وتسعين مليونًا وتسعمئة وتسعة وتسعين ألفًا وتسعمئة وتسعة وتسعين
```

<p dir='rtl' align='right'>
يمكن إرفاق المكتبة في مشاريع Maven باستخدام :
</p>

```x
<dependency>
    <groupId>io.github.osamabmaq</groupId>
    <artifactId>TafqeetJ</artifactId>
    <version>1.1-RELEASE</version>
</dependency>
```
