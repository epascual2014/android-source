package com.bloc.inherit;

// CLASS DEFINITION GOES HERE
// Great Danes can get rather large… Let's add another size category for them: "huge"
class GreatDane extends Dog {
	@Override
	void changeSize(boolean grow) {
		int sizeIndex = getSizeIndex();
		sizeIndex = sizeIndex + (grow ? 1 : -1);
		if (sizeIndex > 4) {
			sizeIndex = 4;
		} else if (sizeIndex < 0) {
			sizeIndex = 0;
		}
		setSize(fromSizeIndex(sizeIndex));
	}

	/*
	 * getSizeIndex
	 * A short-cut for calling #getSizeIndex(java.lang.String) with
	 * the result of #getSize
	 */

	/*
	 * getSizeIndex
	 * @param size the string value representing the size
	 * @return an index between 0 and 3 in the
	 * 		   array of {"tiny", "small", "average", "large"}
	 */
	int getSizeIndex(String size) {
		if (size == null) {
			// Return default "average" when missing size
			return 2;
		}
		switch(size) {
			case "tiny": return 0;
			case "small": return 1;
			case "average": return 2;
			case "large": return 3;
			case "huge": return 4;
			default: return 2;
		}
	}

	/*
	 * fromSizeIndex
	 * @param index the index into the sizes array
	 * @return a String, one of {"tiny", "small", "average", "large"}
	 */
	String fromSizeIndex(int index) {
		switch(index) {
			case 0: return "tiny";
			case 1: return "small";
			case 2: return "average";
			case 3: return "large";
			case 4: return "huge";
			default: return "large";
		}
	}
}