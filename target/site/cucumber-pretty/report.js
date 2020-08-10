$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DarkSky/Timeline.feature");
formatter.feature({
  "line": 1,
  "name": "StarFilter",
  "description": "",
  "id": "starfilter",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify timeline is displayed in correct format",
  "description": "",
  "id": "starfilter;verify-timeline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on Darksky home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I verify timeline is displayed with 2 hours increment",
  "keyword": "Then "
});
formatter.match({
  "location": "TimelineSD.launchDarkSky()"
});
formatter.result({
  "duration": 9684239700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 36
    }
  ],
  "location": "TimelineSD.verifyIncrement(int)"
});
formatter.result({
  "duration": 401279800,
  "status": "passed"
});
formatter.after({
  "duration": 1413068700,
  "status": "passed"
});
formatter.uri("Hotels/ChildrenDropdown.feature");
formatter.feature({
  "line": 1,
  "name": "ChildrenDropdown",
  "description": "",
  "id": "childrendropdown",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify user get correct number of dropdown after selecting children",
  "description": "",
  "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on hotels landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select \u003cchildrenCount\u003e in children dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see \u003cchildrenCount\u003e child age dropdowns",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;",
  "rows": [
    {
      "cells": [
        "childrenCount"
      ],
      "line": 9,
      "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;1"
    },
    {
      "cells": [
        "0"
      ],
      "line": 10,
      "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;2"
    },
    {
      "cells": [
        "1"
      ],
      "line": 11,
      "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;3"
    },
    {
      "cells": [
        "2"
      ],
      "line": 12,
      "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;4"
    },
    {
      "cells": [
        "3"
      ],
      "line": 13,
      "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;5"
    },
    {
      "cells": [
        "4"
      ],
      "line": 14,
      "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;6"
    },
    {
      "cells": [
        "5"
      ],
      "line": 15,
      "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;7"
    },
    {
      "cells": [
        "6"
      ],
      "line": 16,
      "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;8"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Verify user get correct number of dropdown after selecting children",
  "description": "",
  "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on hotels landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select 0 in children dropdown",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see 0 child age dropdowns",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ChildrenDropDownSD.launchHotels()"
});
formatter.result({
  "duration": 10803893500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 9
    }
  ],
  "location": "ChildrenDropDownSD.selectChDrop(String)"
});
formatter.result({
  "duration": 2276249900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 6
    }
  ],
  "location": "ChildrenDropDownSD.dropDowns(int)"
});
formatter.result({
  "duration": 22262000,
  "status": "passed"
});
formatter.after({
  "duration": 1279049600,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify user get correct number of dropdown after selecting children",
  "description": "",
  "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on hotels landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select 1 in children dropdown",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see 1 child age dropdowns",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ChildrenDropDownSD.launchHotels()"
});
formatter.result({
  "duration": 11147905300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 9
    }
  ],
  "location": "ChildrenDropDownSD.selectChDrop(String)"
});
formatter.result({
  "duration": 2141411600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 6
    }
  ],
  "location": "ChildrenDropDownSD.dropDowns(int)"
});
formatter.result({
  "duration": 20884500,
  "status": "passed"
});
formatter.after({
  "duration": 1737310900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify user get correct number of dropdown after selecting children",
  "description": "",
  "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on hotels landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select 2 in children dropdown",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see 2 child age dropdowns",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ChildrenDropDownSD.launchHotels()"
});
formatter.result({
  "duration": 10175823000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 9
    }
  ],
  "location": "ChildrenDropDownSD.selectChDrop(String)"
});
formatter.result({
  "duration": 2154237400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 6
    }
  ],
  "location": "ChildrenDropDownSD.dropDowns(int)"
});
formatter.result({
  "duration": 20521700,
  "status": "passed"
});
formatter.after({
  "duration": 962031100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify user get correct number of dropdown after selecting children",
  "description": "",
  "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on hotels landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select 3 in children dropdown",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see 3 child age dropdowns",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ChildrenDropDownSD.launchHotels()"
});
formatter.result({
  "duration": 10671335600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 9
    }
  ],
  "location": "ChildrenDropDownSD.selectChDrop(String)"
});
formatter.result({
  "duration": 2127027700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 6
    }
  ],
  "location": "ChildrenDropDownSD.dropDowns(int)"
});
formatter.result({
  "duration": 38307700,
  "status": "passed"
});
formatter.after({
  "duration": 1053275600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify user get correct number of dropdown after selecting children",
  "description": "",
  "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on hotels landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select 4 in children dropdown",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see 4 child age dropdowns",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ChildrenDropDownSD.launchHotels()"
});
formatter.result({
  "duration": 10621450500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 9
    }
  ],
  "location": "ChildrenDropDownSD.selectChDrop(String)"
});
formatter.result({
  "duration": 2135061200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 6
    }
  ],
  "location": "ChildrenDropDownSD.dropDowns(int)"
});
formatter.result({
  "duration": 28746600,
  "status": "passed"
});
formatter.after({
  "duration": 1011315100,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify user get correct number of dropdown after selecting children",
  "description": "",
  "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on hotels landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select 5 in children dropdown",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see 5 child age dropdowns",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ChildrenDropDownSD.launchHotels()"
});
formatter.result({
  "duration": 9942356900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 9
    }
  ],
  "location": "ChildrenDropDownSD.selectChDrop(String)"
});
formatter.result({
  "duration": 2169920900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 6
    }
  ],
  "location": "ChildrenDropDownSD.dropDowns(int)"
});
formatter.result({
  "duration": 90186800,
  "status": "passed"
});
formatter.after({
  "duration": 1356207200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify user get correct number of dropdown after selecting children",
  "description": "",
  "id": "childrendropdown;verify-user-get-correct-number-of-dropdown-after-selecting-children;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on hotels landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select 6 in children dropdown",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see 6 child age dropdowns",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ChildrenDropDownSD.launchHotels()"
});
formatter.result({
  "duration": 10539052700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 9
    }
  ],
  "location": "ChildrenDropDownSD.selectChDrop(String)"
});
formatter.result({
  "duration": 2220019200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 6
    }
  ],
  "location": "ChildrenDropDownSD.dropDowns(int)"
});
formatter.result({
  "duration": 48579700,
  "status": "passed"
});
formatter.after({
  "duration": 1000352000,
  "status": "passed"
});
formatter.uri("Hotels/StarFilter.feature");
formatter.feature({
  "line": 1,
  "name": "StarFilter",
  "description": "",
  "id": "starfilter",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify hotel shows up as star rating selected by user",
  "description": "",
  "id": "starfilter;verify-hotel-shows-up-as-star-rating-selected-by-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on \u003cstar\u003e star",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I verify hotels are \u003cstar\u003e star rating",
  "keyword": "And "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "starfilter;verify-hotel-shows-up-as-star-rating-selected-by-user;",
  "rows": [
    {
      "cells": [
        "star"
      ],
      "line": 8,
      "id": "starfilter;verify-hotel-shows-up-as-star-rating-selected-by-user;;1"
    },
    {
      "cells": [
        "5"
      ],
      "line": 9,
      "id": "starfilter;verify-hotel-shows-up-as-star-rating-selected-by-user;;2"
    },
    {
      "cells": [
        "4"
      ],
      "line": 10,
      "id": "starfilter;verify-hotel-shows-up-as-star-rating-selected-by-user;;3"
    },
    {
      "cells": [
        "3"
      ],
      "line": 11,
      "id": "starfilter;verify-hotel-shows-up-as-star-rating-selected-by-user;;4"
    },
    {
      "cells": [
        "2"
      ],
      "line": 12,
      "id": "starfilter;verify-hotel-shows-up-as-star-rating-selected-by-user;;5"
    },
    {
      "cells": [
        "1"
      ],
      "line": 13,
      "id": "starfilter;verify-hotel-shows-up-as-star-rating-selected-by-user;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "Verify hotel shows up as star rating selected by user",
  "description": "",
  "id": "starfilter;verify-hotel-shows-up-as-star-rating-selected-by-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on 5 star",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I verify hotels are 5 star rating",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StarRatingSD.launchResultPage()"
});
formatter.result({
  "duration": 16132030800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 11
    }
  ],
  "location": "StarRatingSD.star(int)"
});
formatter.result({
  "duration": 3769661300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 20
    }
  ],
  "location": "StarRatingSD.verify(int)"
});
formatter.result({
  "duration": 3846533300,
  "status": "passed"
});
formatter.after({
  "duration": 1313540300,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify hotel shows up as star rating selected by user",
  "description": "",
  "id": "starfilter;verify-hotel-shows-up-as-star-rating-selected-by-user;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on 4 star",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I verify hotels are 4 star rating",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StarRatingSD.launchResultPage()"
});
formatter.result({
  "duration": 15711192000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 11
    }
  ],
  "location": "StarRatingSD.star(int)"
});
formatter.result({
  "duration": 2573411500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 20
    }
  ],
  "location": "StarRatingSD.verify(int)"
});
formatter.result({
  "duration": 3197543500,
  "status": "passed"
});
formatter.after({
  "duration": 1052031500,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify hotel shows up as star rating selected by user",
  "description": "",
  "id": "starfilter;verify-hotel-shows-up-as-star-rating-selected-by-user;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on 3 star",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I verify hotels are 3 star rating",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StarRatingSD.launchResultPage()"
});
formatter.result({
  "duration": 15662889200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 11
    }
  ],
  "location": "StarRatingSD.star(int)"
});
formatter.result({
  "duration": 3280909800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 20
    }
  ],
  "location": "StarRatingSD.verify(int)"
});
formatter.result({
  "duration": 3184139300,
  "status": "passed"
});
formatter.after({
  "duration": 973748600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify hotel shows up as star rating selected by user",
  "description": "",
  "id": "starfilter;verify-hotel-shows-up-as-star-rating-selected-by-user;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on 2 star",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I verify hotels are 2 star rating",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StarRatingSD.launchResultPage()"
});
formatter.result({
  "duration": 15550820700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 11
    }
  ],
  "location": "StarRatingSD.star(int)"
});
formatter.result({
  "duration": 2825380100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 20
    }
  ],
  "location": "StarRatingSD.verify(int)"
});
formatter.result({
  "duration": 3640843300,
  "status": "passed"
});
formatter.after({
  "duration": 1047406600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify hotel shows up as star rating selected by user",
  "description": "",
  "id": "starfilter;verify-hotel-shows-up-as-star-rating-selected-by-user;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@enable"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on 1 star",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I verify hotels are 1 star rating",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StarRatingSD.launchResultPage()"
});
formatter.result({
  "duration": 15526174600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 11
    }
  ],
  "location": "StarRatingSD.star(int)"
});
formatter.result({
  "duration": 2635029700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    }
  ],
  "location": "StarRatingSD.verify(int)"
});
formatter.result({
  "duration": 3202433100,
  "status": "passed"
});
formatter.after({
  "duration": 1068963300,
  "status": "passed"
});
});