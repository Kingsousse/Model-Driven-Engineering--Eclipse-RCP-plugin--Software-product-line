Features {
	
	Authentification
	Help
	PayingProcess
	CancelProcess
	ChossingProduct	
}

Combination {
	
	Authentification
	opt ["Help == True"] {
			Help	
		}
	loop [" while UserDesire == TRUE "] {
		PayingProcess	
		alt ["CancelProcess  == True"] {
			CancelProcess
			else
			ChossingProduct

		}

	}

}