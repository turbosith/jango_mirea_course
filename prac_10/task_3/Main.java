package laby.prac_10.task_3;


public class Main
{
    public static void main(String[] args)
    {
        CreateTextDocument create = new CreateTextDocument();
        IDocument t = create.CreateNew("");
        t.run();
    }
}

