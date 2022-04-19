/**
 * Last generated by Orchestration Designer at: 11 DE ABRIL DE 2022 11H8MIN7S BRT
 */
package portuguese.prompts;

public class pmt_repeat extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for pmt_repeat.
	 */
	public pmt_repeat() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 18 DE ABRIL DE 2022 17H59MIN3S BRT
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("pmt_repeat");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,true);

			if ( new com.avaya.sce.runtime.Condition( "condition", "menu2:utterance", com.avaya.sce.runtime.Expression.STRING_EQUAL, "1", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"audio:msg010",false));
			}
			else if ( new com.avaya.sce.runtime.Condition( "condition", "menu2:utterance", com.avaya.sce.runtime.Expression.STRING_EQUAL, "2", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"audio:msg011",false));
			}
			else if ( new com.avaya.sce.runtime.Condition( "condition", "menu2:utterance", com.avaya.sce.runtime.Expression.STRING_EQUAL, "3", false, null ).evaluate(getSession()) == true ) {
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"audio:msg012",false));
			}

	}
}
