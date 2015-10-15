object、class中的apply，
通常借助object中的apply 来构建类的实例

使用apply构建类的实例

抽象类有个伴生对象，
伴生对象有个apply方法，  apply方法去构建 抽象类的实例，
apply用了抽象类的具体实现类 来构建实例。（spark graph中有）