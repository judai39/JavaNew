package inner_class.anonymous_outin;

//2.ĳ�������ķ���ֵ��Ϊ�ӿ�����
public class AnonymousWithReturn {
    interface Value{
        public int  OverrideValue(int value);
    }
    public class ReturnValue{
        public Value valueReturn(){
            return new Value(){
                @Override
                public int OverrideValue(int i) {
                    return i;
                }
            };
        }
    }
}
