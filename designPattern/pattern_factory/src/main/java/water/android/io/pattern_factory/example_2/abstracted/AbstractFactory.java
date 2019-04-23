package water.android.io.pattern_factory.example_2.abstracted;


import water.android.io.pattern_factory.example_2.bean.button.Button;
import water.android.io.pattern_factory.example_2.bean.text.Text;

public abstract class AbstractFactory {

    public abstract Button createButton();

    public abstract Text createText();

}

