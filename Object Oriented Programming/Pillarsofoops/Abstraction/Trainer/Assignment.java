public abstract class Assignment{
    String trainer;
    String topic;

    Assignment(String trainer,String topic){
        this.trainer = trainer;
        this.topic  = topic;
    }

    public abstract void submit();
}

class java extends Assignment{
    java(String trainer,String topic){
        super(trainer,topic);
    }

    @Override
    public void submit(){
        System.out.println("The "+ topic + " Assignment is given by: " + trainer);
    }
}

class SQL extends Assignment{
    SQL(String trainer,String topic){
        super(trainer,topic);
    }

    @Override
    public void submit(){
        System.out.println("The "+ topic + " Assignment is given by: " + trainer);
    }
}

class WebTech extends Assignment{
    WebTech(String trainer,String topic){
        super(trainer,topic);
    }

    @Override
    public void submit(){
        System.out.println("The "+ topic + " Assignment is given by: " + trainer);
    }
}