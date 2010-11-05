//
//  iPhoneDivePoolAppDelegate.h
//  iPhoneDivePool
//
//  Created by Hans Olav on 11/6/10.
//  Copyright (c) 2010 __MyCompanyName__. All rights reserved.
//

#import <UIKit/UIKit.h>

@class iPhoneDivePoolViewController;

@interface iPhoneDivePoolAppDelegate : NSObject <UIApplicationDelegate> {
    UIWindow *window;
    iPhoneDivePoolViewController *viewController;
}

@property (nonatomic, retain) IBOutlet UIWindow *window;

@property (nonatomic, retain) IBOutlet iPhoneDivePoolViewController *viewController;

@end
