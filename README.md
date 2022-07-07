# lombok-bug-report

This project is a demonstration of a bug/undocumented issue in lombok connected with ExtensionMethod annotation. <br/>
It seems that ExtensionMethod annotation does not work when the said methods are a part of an interface instead of a class. <br/>

When trying to extend methods with interafaces Try, TrySecond, TryThird compilation fails with "error: cannot find symbol xxxx.method_name".
This can be easily bypassed using a proxy class like Ext, but lombok's documentation does not mention said issue.
