# TafqeetJ
هذه مكتبة برمجية مكتوبة بلغة البرمجة جافا وهي مختصة بتفقيط الأعداد - أي تحويل العدد من الصيغة المكتوبة بالأرقام إلى الصيغة المكتوبة بالكلمات - وهي مفتوحة المصدر ومرخصة برخصة معهد ماساتشوستس للتكنولوجيا .

تدعم هذه المكتبة الأرقام السالبة والموجبة، العشرية والصحيحة. يمكنها تفقيط رقم مكون من 15 خانة كحد أقصى على يسار الفاصلة العشرية، و 15 خانة أخرى كحد أقصى على يمين الفاصلة العشرية.

تدعم هذه المكتبة أنواع البيانات العددية الصحيحة التالية:
- int
- byte
- short
- long
- BigInteger

أما بالنسبة للأعداد العشرية، فالنوع الوحيد المدعوم هو:
- BigDecimal
ولم يتم دعم أنواع البيانات البدائية/الأولية العشرية الأخرى لصعوبة التعامل مع الأرقام على يمين الفاصلة فيها بسبب التمثيل الثنائي لها في ذاكرة الحاسوب.

كيف تستخدم هذه المكتبة ؟

هنالك واجهتان مخصصتان ليتعامل المستخدم مع هذه المكتبة، الأولى هي:
- TafqeetRangeChecker class
هذا الكلاس مخصص لتستخدمه في التحقق ما إذا كانت المكتبة تستطيع تفقيط عدد ما قبل إرساله إلى دوال الكلاس Tafqeet، وذلك لتجنب رمي استثناء.

والواجهة الثانية هي:
- Tafqeet class
ويحوي هذا الكلاس الدوال اللازمة لتفقيط جميع أنواع البيانات المدعومة.

مثال:
Tafqeet tafqeet = Tafqeet.getInstance();
if(!TafqeetRangeChecker.isOutOfRange(-999_999_999_999_999L)
  System.out.println(tafqeet.doTafqeet(-999_999_999_999_999));
